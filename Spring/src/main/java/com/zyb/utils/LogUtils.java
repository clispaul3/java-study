package com.zyb.utils;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
@Component
public class LogUtils {
    @Before("execution(public int com.zyb.utils.Calculator.add(int,int))")
    public static void logStart(){
        System.out.println("logStart...");
    }
}
