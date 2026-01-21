public class Main {
    public static void main(String[] args) throws Exception {
        PrintFeature.printer("We have a new feature!");

        //skapa ett server objekt
        var server = new org.eclipse.jetty.server.Server(8080);

        //skapa en container så att vi kan använda den
        var context = new org.eclipse.jetty.servlet.ServletContextHandler();
        //stoppa in vår nya sida (path) i våt context
        context.addServlet(RootServlet.class, "/");
        context.addServlet(HelloServlet.class, "/hello/*");
        // stoppa in servern i containern
        server.setHandler(context);

        // hopp och lek!
        server.start();
        server.join();

    }
}
