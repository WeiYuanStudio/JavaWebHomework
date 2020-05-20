package club.piclight.homework.javaweb.view.EX3;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 验证码View
 */
@IndexMark(experimentID = 3, title = "验证码", url = "./ex3/captcha-view.do")
@WebServlet(urlPatterns = "/ex3/captcha-view.do")
public class EX3_3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex3/captcha-view.html");
        rd.forward(req, resp);
    }
}
