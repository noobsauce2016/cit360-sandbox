	import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletExample -
 */
@WebServlet("/servletExample")
public class servletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public servletExample() {
        super();
        
    }

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException { 
			
PrintWriter out = response.getWriter();
		
		String myName = " Brandon";
		
		out.println("<html><body><h1 align='center'>servletExample</h1>"
					+ "<br>My name is: " + myName + "<br>"
					+ "</body></html>");
				
	}
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

}
