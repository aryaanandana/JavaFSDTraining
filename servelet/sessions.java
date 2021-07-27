package com.ust.servlet6;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sessions
 */
@WebServlet("/sessions")
public class sessions extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     
    public sessions() {
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        HttpSession session = request.getSession(true);
	        
	        Date created = new Date(session.getCreationTime());
	        Date accessed = new Date(session.getLastAccessedTime());
	        out.println("ID " + session.getId());
	        out.println("Created: " + created);
	        out.println("Last Accessed: " + accessed);
	        
	        String dataName = request.getParameter("dataName");
	        if (dataName != null && dataName.length() > 0) {
	            String dataValue = request.getParameter("dataValue");
	            session.setAttribute(dataName, dataValue);
	        }
	        
	        Enumeration e = session.getAttributeNames();
	        while (e.hasMoreElements()) {
	            String name = (String)e.nextElement();
	            String value = session.getAttribute(name).toString();
	            out.println(name + " = " + value);
	        }


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//}

}
