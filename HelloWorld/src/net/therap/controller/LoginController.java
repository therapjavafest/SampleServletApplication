package net.therap.controller;

import net.therap.domain.User;
import net.therap.service.UserService;
import net.therap.service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: sazzadur
 * @since: 10/2/12 4:11 PM
 */
@WebServlet("/login.html")
public class LoginController extends HttpServlet {

    private UserService userService;

    public LoginController() {
        userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User loggingInUser = new User();
        loggingInUser.setUserName(request.getParameter("userName"));
        loggingInUser.setPassword(request.getParameter("password"));

        User verifiedUser = userService.verifyUser(loggingInUser);

        if (verifiedUser != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", verifiedUser);
            response.sendRedirect("/helloWorld/home.html");
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
            requestDispatcher.forward(request, response);
        }

    }
}
