package club.piclight.homework.javaweb.Mock;

import club.piclight.homework.javaweb.Model.Book;

import java.util.HashMap;
import java.util.Map;

public class BookMap {
    private static Map<Long, Book> bookMap;

    private BookMap() {

    }

    public static synchronized Map<Long, Book> getBookMap() {
            if(bookMap == null) {
                bookMap = new HashMap<>();
                Book tempBook1 = new Book(1L,
                        "C++ Primer",
                        "https://m.media-amazon.com/images/I/41Alo4vb7TL._SL160_.jpg",
                        100D,
                        1);
                bookMap.put(1L, tempBook1);
                Book tempBook2 = new Book(2L,
                        "Thinking in Java",
                        "https://m.media-amazon.com/images/I/510KyTv95PL._SL160_.jpg",
                        80D,
                        1);
                bookMap.put(2L, tempBook2);
                Book tempBook3 = new Book(3L,
                        "红宝书",
                        "https://m.media-amazon.com/images/I/51LuMamFRRL._SL160_.jpg",
                        120D,
                        1);
                bookMap.put(3L, tempBook3);
            }
        return bookMap;
    }
}
