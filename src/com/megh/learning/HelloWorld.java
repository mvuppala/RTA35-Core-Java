package com.megh.learning;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
     //   int a = 1;
        int i = 1;
        //i++;
        method1(i);
    }

    public static void method1(int i) {
        System.out.println("In method 1");
        i++;
        System.out.println("i increased "+ i);
        method2(i);
    }

    public static void method2(int i) {
        System.out.println("In method 2");
        i++;
        System.out.println("i increased "+ i);
    }
}
