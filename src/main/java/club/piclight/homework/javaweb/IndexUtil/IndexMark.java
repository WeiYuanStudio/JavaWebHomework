package club.piclight.homework.javaweb.IndexUtil;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IndexMark {
    public int experimentID() default Integer.MAX_VALUE; //第N次实验

    public String title() default "UNKNOWN"; //链接描述

    public String url() default ""; //页面链接
}
