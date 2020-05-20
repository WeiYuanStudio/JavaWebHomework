package club.piclight.homework.javaweb.view.EX3;

import club.piclight.homework.javaweb.DB.GuessNumberRepository;
import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@IndexMark(experimentID = 3, title = "猜数字", url = "./ex3/guess-number.do")
@WebServlet(urlPatterns = {"/ex3/guess-number.do"})
public class EX3_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex3/guess-number.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actionType = req.getParameter("action");
        switch (actionType) {
            /* 生成数字操作 */
            case "generate":
                String jSession = req.getSession().getId();
                GuessNumberRepository.generateGuessNumber(jSession);
                resp.setStatus(HttpServletResponse.SC_FOUND);
                resp.setHeader("Location", "./guess-number.do"); //生成完毕直接重定向
                break;

            /* 猜数字与显示答案 */
            case "guess":
            case "show":
                RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex3/guess-number-resp.jsp");
                rd.forward(req, resp);
                break;
        }
    }
}
