package club.piclight.homework.javaweb.view.EX_2;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 实验2-3
 * <p>
 */
@IndexMark(experimentID = 2, title = "Servlet路径", url = "./ex2/pathshow")
@WebServlet(urlPatterns = {"/ex2/pathshow/*"})
public class EX2_3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("getRequestURI(): " + req.getRequestURI());
        out.println("getContextPath(): " + req.getContextPath());
        out.println("getServletPath(): " + req.getServletPath());
        out.println("getPathInfo(): " + req.getPathInfo());
    }
}
