package com.zyb;

import com.zyb.dao.Component;
import com.zyb.dao.Sheep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App  {
    public static void main(String[] args) throws Exception {
        App.componentCloneTest();
    }
    public static void componentCloneTest() throws Exception{
        Component c1 = new Component("tree");
        c1.setParent(new Component("page"));
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c1);
        oos.flush();
        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Component c2=(Component)ois.readObject();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println();
        c2.setCname("button");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    public static void sheepCloneTest(){
        Sheep sheep= new Sheep("Tom",2,"red");
        sheep.setFriend(new Sheep("Jack",3,"blue"));
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());
    }
}
