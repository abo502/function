package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Sequence extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("gbk");
        String num = req.getParameter("num");
        if (num.equals("")) {
            resp.sendRedirect("error.jsp");
            return;
        }
        int one = Integer.parseInt(num);
        if (one < 1 || one > 92) {
            resp.sendRedirect("error.jsp");
            return;
        }
        long a = 1;
        long b = 1;
        long temp;
        for (int i = 3; i <= one; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        HttpSession session = req.getSession(true);
        session.setAttribute("result", b);
        resp.sendRedirect("/index.jsp");
    }
}
