package club.piclight.homework.javaweb.view.EX3;

import com.wf.captcha.utils.CaptchaUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Captcha code API
 */
@WebServlet(urlPatterns = "/ex3/captcha.do")
public class EX3_2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CaptchaUtil.clear(req);
        CaptchaUtil.out(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        boolean ver = CaptchaUtil.ver(req.getParameter("captcha"), req);
        CaptchaUtil.clear(req);
        req.setAttribute("isPass", ver);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex3/captcha-view-resp.jsp");
        rd.forward(req, resp);
    }
}
