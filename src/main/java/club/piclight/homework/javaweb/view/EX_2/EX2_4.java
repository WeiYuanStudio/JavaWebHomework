package club.piclight.homework.javaweb.view.EX_2;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@IndexMark(experimentID = 2, title = "登录表单", url = "./ex2/login.do")
@WebServlet(urlPatterns = {"/ex2/login.do"})
public class EX2_4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex2/login.html");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex2/login-resp.jsp");
        rd.forward(req, resp);
    }
}
