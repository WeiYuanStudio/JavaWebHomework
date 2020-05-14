package club.piclight.homework.javaweb.DB;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class DBSessionFactory {
    private static final String MYBATIS_CONF_PATH = "./club/piclight/homework/javaweb/mybatis-config.xml";
    private final SqlSessionFactory sqlSessionFactory;
    DBSessionFactory() throws IOException {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(MYBATIS_CONF_PATH));
    }

    SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
