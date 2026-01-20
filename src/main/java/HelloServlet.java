import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //säg till att vi kommer ha en path
        String path = req.getPathInfo();

        //fattar ingenting -- Magi
        String name = (path != null && path.length() > 1)
                ? path.substring(1)
                : "";

        //Skriv ut värdet
        resp.getWriter().println("Hej! " + name);
    }
}
