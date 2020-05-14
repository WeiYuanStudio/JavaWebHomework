package club.piclight.homework.javaweb.DB;

import club.piclight.homework.javaweb.Model.GuessNumber;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.Random;

public class GuessNumberRepository {
    public static boolean generateGuessNumber(String jSession) throws IOException {
        Random rand = new Random();
        int randInt = rand.nextInt(100);
        if (!hasGuessNumber(jSession)) {
            GuessNumber number = new GuessNumber(jSession, randInt);
            SqlSession sqlSession = new DBSessionFactory().getSqlSession();
            sqlSession.insert("addRecord", number);
            sqlSession.commit();
        } else {
            SqlSession sqlSession = new DBSessionFactory().getSqlSession();
            GuessNumber number = new GuessNumber(jSession, randInt);
            sqlSession.update("updateRecord", number);
            sqlSession.commit();
        }
        return true;
    }

    /**
     * 猜数字记录是否存在
     * @return
     */
    public static boolean hasGuessNumber(String jSession) {
        try {
            if (getGuessNumber(jSession) == null)
                throw new RuntimeException("DB query null record");
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 获取猜数字记录
     */
    public static Integer getGuessNumber(String jSession) throws IOException {
        SqlSession sqlSession = new DBSessionFactory().getSqlSession();
        GuessNumber guessNumber = sqlSession.selectOne("getRecord", jSession);
        return guessNumber.getNumber();
    }
}
