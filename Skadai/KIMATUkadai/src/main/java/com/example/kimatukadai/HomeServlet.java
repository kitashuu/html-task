package com.example.kimatukadai;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utils.mathDAO;
import utils.mathBean;

import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();

        if ( session.getAttribute("name") != null ) {
            int user_id = (int) session.getAttribute("user_id");
//            ArrayList<String> result = mathDAO.select(user_id);

//            request.setAttribute("isbn_list",result);




            String path = "/WEB-INF/view/home.jsp";
            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(""); // indexへ
        }

    }
}
