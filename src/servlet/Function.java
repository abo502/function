package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Function extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("gbk");
        String num1 = req.getParameter("x");
        String num2 = req.getParameter("y");
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int count=(x*2)+y;
        HttpSession session = req.getSession();
        session.setAttribute("result", count);
        resp.sendRedirect("/index.jsp");
    }
}
