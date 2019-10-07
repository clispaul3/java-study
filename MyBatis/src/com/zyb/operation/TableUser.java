package com.zyb.operation;

import com.zyb.dao.User;
import com.zyb.dao.UserMapper;

public class TableUser {
    public static void test(UserMapper mapper){
        System.out.println("test");
        selectTest(mapper);
//        insertTest(mapper);
//        updateTest(mapper);
//        deleteTest(mapper);
    }
    public static void selectTest(UserMapper mapper){
        User user = mapper.getUser("孙权84",8);
        System.out.println(user.toString());
    }
    public static void insertTest(UserMapper mapper){
        int count = 0;
        while (count++<100){
            User user = new User();
            user.setUsername("孙权"+count);
            user.setAge((int)(Math.random()*count));
            user.setUserAddress("江苏");
            mapper.insertOne(user);
        }
//        User user = new User();
//        user.setUsername("孙权");
//        user.setAge(30);
//        user.setUserAddress("江苏");
//        int result = mapper.insertOne(user);
//        System.out.println(result);
//        System.out.println(user.getId());
    }
    public static void updateTest(UserMapper mapper){
        User user = new User();
        user.setUsername("zhangfei");
        user.setAge(29);
        int result = mapper.updateOne(user);
        System.out.println(result);
    }
    public static void deleteTest(UserMapper mapper){
        int result = mapper.deleteOne("孙权%");
        System.out.println(result);
    }
}
