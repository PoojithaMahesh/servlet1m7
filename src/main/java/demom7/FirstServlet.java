package demom7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	   PrintWriter printWriter=res.getWriter();
	   printWriter.print("Yes Finally i have received the response in the browser");
		
	}

}
