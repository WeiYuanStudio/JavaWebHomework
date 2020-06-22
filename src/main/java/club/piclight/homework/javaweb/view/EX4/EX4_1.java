package club.piclight.homework.javaweb.view.EX4;

import club.piclight.homework.javaweb.IndexUtil.IndexMark;
import club.piclight.homework.javaweb.Mock.BookMap;
import club.piclight.homework.javaweb.Model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@IndexMark(experimentID = 4, title = "Book List", url = "./ex4/book-list.do")
@WebServlet(urlPatterns = {"/ex4/book-list.do"})
public class EX4_1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("bookMap") == null) {
            Map<Long, Book> bookMap = BookMap.getBookMap();
            req.getSession().setAttribute("bookMap", bookMap);
        }

        req.setAttribute("bookList", new ArrayList<Book>(((Map<Long, Book>) req.getSession().getAttribute("bookMap")).values()));

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/ex4/book-list.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String action = req.getParameter("actionType");
        Long id = Long.valueOf(req.getParameter("id"));
        Map<Long, Book> bookMap = (Map<Long, Book>) req.getSession().getAttribute("bookMap");
        Book tempBook = (bookMap).get(id);

        switch (action) {
            case "add":
                tempBook.addNum();
                bookMap.put(id, tempBook);
                break;
            case "remove":
                tempBook.removeNum();
                bookMap.put(id, tempBook);
                break;
        }

        resp.setStatus(HttpServletResponse.SC_FOUND);
        resp.setHeader("Location", req.getContextPath() + "/ex4/book-list.do");
    }
}
