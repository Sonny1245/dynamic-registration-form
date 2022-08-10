

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginCheck") //In this case: url = login.jsp
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginCheck() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		
		request.getAttribute(username);
		request.getAttribute(password);
			
		if(username.equalsIgnoreCase("java") && password.equalsIgnoreCase("1234")) {
			
			response.sendRedirect("member-page.jsp");
			
					
		}else {
			
			response.sendRedirect("error-page.jsp");
			
		}
		
		
	}

}
