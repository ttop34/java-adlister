import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewCounterServlet", urlPatterns = "/count")
public class ViewCounter extends HttpServlet{

    private int count;

    public void init() {
        count = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        count++;
        PrintWriter out = response.getWriter();
            out.println("<h1> View Count: " + count);
        }

    }
