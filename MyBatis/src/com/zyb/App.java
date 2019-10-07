package com.zyb;

import com.zyb.dao.User;
import com.zyb.dao.UserMapper;
import com.zyb.operation.TableUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. SqlSession 是非线程安全的，每次使用都应该去获取新的对象
 * 2. SqlSession 代表和数据库的一次会话，用完必须关闭
 * 3. mapper接口没有实现类，但是mybatis会为这个接口生成一个代理对象
 * 4. 两个重要的配置文件
 *   - mybatis全局配置文件
 *   - sql映射文件
 */
public class App {
    public static void main(String[] args) {
        test2();
//        test1();
    }
    // 绑定接口，通过配置文件创建接口实现类
    public static void test2(){
        String resource = "myBatis.xml";
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession session = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
            UserMapper mapper = session.getMapper(UserMapper.class);
            TableUser.test(mapper);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    // 绑定sql映射文件
    public static void test1(){
        String resource = "myBatis.xml";
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession session = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
            User user = session.selectOne("com.zyb.dao.User.selectUser", "zhangfei");
            System.out.println(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
