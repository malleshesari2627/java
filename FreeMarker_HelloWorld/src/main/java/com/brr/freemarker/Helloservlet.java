package com.brr.freemarker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloservlet
 */
public class Helloservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    private static List<User> userList = new ArrayList<User>();
	
	//Just prepare static data to display on screen
	static {
		userList.add(new User("Bill", "Gates"));
		userList.add(new User("Steve", "Jobs"));
		userList.add(new User("Larry", "Page"));
		userList.add(new User("Sergey", "Brin"));
		userList.add(new User("Larry", "Ellison"));
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 request.setAttribute("users", userList);

		    request.getRequestDispatcher("/index.ftl").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String firstname = request.getParameter("firstname");
		    String lastname = request.getParameter("lastname");

		    if (null != firstname && null != lastname &&
		        !firstname.isEmpty() && !lastname.isEmpty()) {

		        synchronized(userList) {
		            userList.add(new User(firstname, lastname));
		        }

		    }

		doGet(request, response);
	}

}
