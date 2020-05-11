package club.piclight.homework.javaweb.view.EX_2;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@IndexMark(experimentID = 2, title = "Date IP QueryString", url = "./ex2/misc.do")
@WebServlet(urlPatterns = {"/ex2/misc.do"})
public class EX2_5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Time: " + new SimpleDateFormat().format(new Date()));
        out.println("Remote IP: " + req.getRemoteAddr());
        out.println("Query String: " + req.getQueryString());
    }
}
