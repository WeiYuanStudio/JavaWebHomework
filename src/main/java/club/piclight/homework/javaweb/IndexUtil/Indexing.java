package club.piclight.homework.javaweb.IndexUtil;

import java.util.*;

import org.reflections.Reflections;

public class Indexing {
    static Set<Class<?>> getClassSet() {
        Reflections reflections = new Reflections("club.piclight.homework.javaweb.view"); //检查该包
        return reflections.getTypesAnnotatedWith(IndexMark.class);
    }

    public static List<IndexMark> getClassIndexMarkList() {
        List<IndexMark> tempList = new ArrayList<>();
        getClassSet().forEach(clazz -> {
            IndexMark mark = (IndexMark) ((Class) clazz).getDeclaredAnnotation(IndexMark.class);
            tempList.add(mark);
        });
        return tempList;
    }
}
