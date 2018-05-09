package com.gr00shik;

import com.gr00shik.util.MyTest;
import com.gr00shik.util.MyTest2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("------------------------");
        MyTest myTest = new MyTest();
        myTest.myPrintMethod();
        System.out.println("------------------------");
        MyTest2 myTest2 = new MyTest2();
        System.out.println(myTest2.myAnnotMethod());
        System.out.println("------------------------");
    }
}
