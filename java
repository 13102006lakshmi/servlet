import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/life") 
public class LifeCycleServlet extends HttpServlet {
 public void init() throws ServletException { 
   System.out.println("init() called");
}
 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOExceptio {
    response.setContentType("text/plain");
    response.getWriter().println("Request processed by servlet.");
    System.out.println("service/doGet() called");
  } 
 public void destroy() 
  { 
    System.out.println("destroy() called"); 
}
} T
