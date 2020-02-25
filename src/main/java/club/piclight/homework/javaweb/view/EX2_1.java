package club.piclight.homework.javaweb.view;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 实验2-1
 * <p>
 * 新建项目，练习教材上相关例子Hello.java文件，P29。并练习如何在Tomcat服务器上发布该文件
 */
@IndexMark(experimentID = 2, title = "一个简单的 Servlet Hello World", url = "./hello_world.do")
@WebServlet(urlPatterns = {"/hello_world.do"})
public class EX2_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello World !</h1>");
        out.close();
    }
}
