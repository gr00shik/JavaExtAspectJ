package com.gr00shik;

import com.gr00shik.util.MyTest;
import com.gr00shik.util.MyTest2;
import com.gr00shik.util.MyTest3;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("------------------------");
        MyTest myTest = new MyTest();
        myTest.myPrintMethod();
        System.out.println("------------------------");
        MyTest2 myTest2 = new MyTest2();
        System.out.println(myTest2.myAnnotMethod());
        System.out.println("------------------------");
        MyTest3 myTest3 = new MyTest3();
        System.out.println(myTest3.test());
        System.out.println("------------------------");
    }
}
