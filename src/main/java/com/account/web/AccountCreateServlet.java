package com.account.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.account.dto.AccountDetails;
import com.account.service.AccountService;

/**
 * Servlet that handles account creation
 * @author namratarane
 *
 */
public class AccountCreateServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// gather data from UI
		// Call the code for posting this data to webservice
		// get webservice return code and redirect to success/failure

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String newsletter = request.getParameter("newsletter");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");

		/*
		 * System.out.println("fname="+fname);
		 * System.out.println("lname="+lname);
		 * System.out.println("email="+email);
		 * System.out.println("newsletter="+newsletter);
		 * System.out.println("password="+password);
		 * System.out.println("confirmPass="+confirmPassword);
		 */

		AccountDetails details = new AccountDetails(fname, lname, email,
				newsletter, password, confirmPassword);

		AccountService service = new AccountService();
		boolean accountCreated = false;
		try {
			accountCreated = service.createAccount(details);
		} catch (Exception e) {
			e.printStackTrace();
			accountCreated = false;
		}
		if (accountCreated) {
			request.getRequestDispatcher("/success.jsp").forward(request,
					response);
		} else {
			request.getRequestDispatcher("/failure.jsp").forward(request,
					response);
		}
	}

}
