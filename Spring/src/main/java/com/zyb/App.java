package com.zyb;


import com.zyb.controller.BookController;
import com.zyb.dao.*;
import com.zyb.dao.User;
import com.zyb.utils.Calculator;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        System.out.println("test");
        test13();
    }
    public static void test13(){
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.add(1,2);
    }
    @Test
    public static void test12(){
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        BookController bookController = (BookController) context.getBean("bookController");
        System.out.println(bookController.hashCode());
        bookController.doGet();
    }
    public static void test11(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans07.xml");
        Person person = (Person) context.getBean("user");
        System.out.println(person.toString());
    }
    public static void test10(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("database.xml");
        SqlSessionFactory sessionFactory = (SqlSessionFactory) context.getBean("dataSource");
        SqlSession session = sessionFactory.openSession();
        System.out.println(session.hashCode());
        Person person = session.selectOne("com.zyb.dao.Person.selectOne", "zhangyb");
        System.out.println(person.toString());
        session.close();
    }
    public static void test09(){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");
        Computer computer = (Computer) context.getBean("computer01");
        System.out.println(computer.getBrand());
        context.close();
    }
    public static void test08(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans05.xml");
        Computer computer = (Computer) context.getBean("computer01");
        System.out.println(computer.toString());
        Computer computer1 = (Computer) context.getBean("computer02");
        System.out.println(computer1.toString());
        Computer computer2 = (Computer) context.getBean("computer03");
        System.out.println(computer2);
    }
    public static void test07(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans04.xml");
        User user = (User) context.getBean("user02");
        System.out.println(user.getUsername());
    }
    public static void test06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans04.xml");
        User user = (User) context.getBean("user01");
        System.out.println(user.getCard().getId());
        IDCard card = (IDCard) context.getBean("card01");
        System.out.println(card.getId());
    }
    public static void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        User user = (User) context.getBean("user01");
        System.out.println(user.getHobbies().get("001"));
    }
    public static void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        User user = (User) context.getBean("user03");
        System.out.println(user.getHobbies().get("002"));
    }
    @Test
    public static void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        User user = (User) context.getBean("user02");
        System.out.println(user.toString());
    }
    public static void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        User user01 = (User) context.getBean("user01");
        System.out.println(user01.toString());
        IDCard card = (IDCard) context.getBean("getIDCard");
        card.setId("10010");
        System.out.println(user01.getCard().getId());
    }
    public static void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user01");
        System.out.println(user.toString());
        User user2 = (User) context.getBean("user02");
        System.out.println(user2.toString());
        User user3 = (User) context.getBean("user03");
        System.out.println(user3.toString());
        User user4 = (User) context.getBean("user04");
        System.out.println(user4.toString());
        User user5= (User) context.getBean("user05");
        System.out.println(user5.toString());
    }
}
