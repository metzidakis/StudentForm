package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import Students.Student;

/**
 * Servlet implementation class StudentFormHandler
 */
@WebServlet("/StudentFormHandler")
public class StudentFormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentFormHandler() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
        String fullname = request.getParameter("fullname");
        
        
		Student student = new Student(id,fullname);
		response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = new PrintWriter(response.getWriter());
        
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset='utf-8'>");
        out.println("        <meta http-equiv='X-UA-Compatible' content='IE=edge'>");
        out.println("        <meta name='viewport' content='width=device-width, initial-scale=1'>");
        out.println("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->");
        out.println("        <title>Sample Bootstrap form</title>");
        out.println("        <!-- Bootstrap core CSS -->");
        out.println("        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
        out.println("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
        out.println("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->");
        out.println("        <!--[if lt IE 9]>");
        out.println("          <script src='https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js'></script>");
        out.println("          <script src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js'></script>");
        out.println("        <![endif]-->");
        out.println("    </head>");
        out.println("    <body>");
        out.println("      <div class='container'>");
        out.println("        <h1>Data from Client</h1>");
        out.println("        <div class='alert alert-info'>");
        out.println("id:" + id + "<br>");
        out.println("fullname:" +fullname + "<br>");
        out.println("        </div>");
        out.println("      </div><!-- /.container -->");
        out.println("      <!-- JavaScript files before the closing body tag -->");
        out.println("      <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js'></script>");
        out.println("      <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("  </body>");
        out.println("</html>");
	}
}
