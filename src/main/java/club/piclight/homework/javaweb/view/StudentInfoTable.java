package club.piclight.homework.javaweb.view;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@IndexMark(experimentID = 1, title = "一个简单的学生表单", url = "./ex1/student-info.do")
@WebServlet(urlPatterns = {"/ex1/student-info.do"})
public class StudentInfoTable extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex1/student-info-table.html");
        rd.forward(req, resp);
    }
}
