package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Count extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("gbk");
        String one=req.getParameter("num1");
        String two=req.getParameter("num2");
        if (one.equals("")|| two.equals("")){
            resp.sendRedirect("error.jsp");
            return;
        }
        int num1=Integer.parseInt(one);
        int num2=Integer.parseInt(two);
        int count=num1;
        for (int i = num1; i <=num2; i++) {
            count+=i;
        }
        HttpSession session = req.getSession(true);
        session.setAttribute("result",count);
        resp.sendRedirect("/index.jsp");
    }
}
