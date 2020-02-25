package club.piclight.homework.javaweb.view;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 实验2-2
 * <p>
 *
 */
@IndexMark(experimentID = 2, title = "一个简单的 Welcome User 页面", url = "./ex2/welcome")
@WebServlet(urlPatterns = {"/ex2/welcome"})
public class EX2_2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex2/welcome.html");
        rd.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome " + name + "</h1>");
        out.close();
    }
}
