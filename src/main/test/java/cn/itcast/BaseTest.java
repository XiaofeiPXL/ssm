package cn.itcast;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

/**
 * @program: ssm
 * @description: 初始化数据库连接池,工具类使用static关键字修饰方法
 * @author: Xiaofei Wang
 * @created: 2020/09/26 17:02
 */


public class BaseTest {
    static InputStream inputStream;

    public static SqlSession init() {
        try {
            inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        return sqlSessionFactory.openSession(true);
    }

    public static void destroy(SqlSession sqlSession, InputStream inputStream, Connection connection) {
        try {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
