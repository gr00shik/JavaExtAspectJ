package com.gr00shik.util;

@InvAspect
public class MyTest2 {
    public String myAnnotMethod(){
        System.out.println("Invoke myAnnotMethod");
        return "return value";
    }
}
