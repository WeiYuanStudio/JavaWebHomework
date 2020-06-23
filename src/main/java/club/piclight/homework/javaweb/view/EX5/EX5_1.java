package club.piclight.homework.javaweb.view.EX5;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;
import club.piclight.homework.javaweb.Model.TaxBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@IndexMark(experimentID = 5, title = "税收计算", url = "./ex5/tax-cal.do")
@WebServlet(urlPatterns = {"/ex5/tax-cal.do"})
public class EX5_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex5/tax-cal.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex5/tax-cal-show.jsp");
        rd.forward(req, resp);
    }
}
