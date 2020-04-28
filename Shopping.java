import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Shopping extends HttpServlet {
 
   
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String username=request.getParameter("fn");
      if(username.length()==0)
          out.println("Please enter your username properly");
      else     
          response.sendRedirect("thankyou.html");
   }
}
