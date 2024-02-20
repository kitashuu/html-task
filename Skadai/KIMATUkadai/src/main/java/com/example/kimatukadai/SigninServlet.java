package com.example.kimatukadai;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utils.userBean;
import utils.userDAO;
import utils.GenerateHash;
import java.io.IOException;
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        }
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
                // POSTパラメータ受け取り
                request.setCharacterEncoding("UTF-8");
                int id = Integer.parseInt(request.getParameter("id"));
                String pw = request.getParameter("pw");
                // ログイン処理
                // 1. DB検索(ID)
                userBean result = userDAO.selectById(id);
                // 2. pw比較
                if ( GenerateHash.checkPassword(pw, result.getPw()) ) {
                        // ログイン情報をセッションに登録
                        HttpSession session = request.getSession();
                        session.setAttribute("name", result.getName());
                        session.setAttribute("user_id",result.getId());
                        // 3. 一致したらhome.jspにリダイレクト
                        response.sendRedirect("HomeServlet");
                } else {
                        // 一致しない
                        response.sendRedirect("");
                }
        }
}