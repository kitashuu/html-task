package com.example.kimatukadai;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import utils.mathBean;
import utils.mathDAO;
import utils.userBean;
import utils.userDAO;

@WebServlet("/keisanServlet")
public class keisanServlet extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                HttpSession session = request.getSession();

                if (session.getAttribute("name") != null) {
                        // String isbn = "";//後で変える
                        //bookBean book = GoogleBooksAPI.searchISBN(isbn);
                        //request.setAttribute("books",book);

                        String path = "/WEB-INF/view/keisan.jsp";
                        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
                        dispatcher.forward(request, response);
                } else {
                        response.sendRedirect(""); // indexへ
                }
        }


        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                //DBに登録する処理を書きます
                request.setCharacterEncoding("UTF-8");
                int hourlyRate =Integer.parseInt(request.getParameter("hourlyRate"));
                int weeklyHours = Integer.parseInt(request.getParameter("weeklyHours"));
                int weeksPerYear = Integer.parseInt(request.getParameter("weeksPerYear"));
                int annual_workweeks = Integer.parseInt(request.getParameter("annual_workweeks"));

                HttpSession session = request.getSession();
                int userId = (int)(session.getAttribute("user_id"));
                mathBean math = new mathBean(hourlyRate,weeklyHours,weeksPerYear,annual_workweeks);
                mathDAO.insert(math);

                response.sendRedirect("");
        }
}

