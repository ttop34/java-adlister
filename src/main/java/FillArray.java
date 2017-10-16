import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "FillArrayServlet", urlPatterns = "/table")
public class FillArray extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int size = 0;
        String fill ="";
        size = Integer.parseInt(request.getParameter("size"));
        fill = request.getParameter("fill");
        String[] array = new String[size];
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + array + "</h1>");

    }
}

