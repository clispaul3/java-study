package com.zyb;

import com.zyb.exception.MyException;

public class App {
    public static void main(String[] args) {
        try {
            test("");
        } catch (MyException e) {
            System.out.println(e.getErrorMessage());
        }
    }
    public static void test(String str) throws MyException {
        if(str.equals("")){
            throw new MyException();
        }
    }
}
