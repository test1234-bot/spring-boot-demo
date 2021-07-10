package com.example.demo.domain;

import java.util.UUID;

public class MyTest {

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);

        int num = 5000;
        int size = 10;

        int n = size / num;
        System.out.println(n);
        System.out.println(size % num);

        String str = "000000000";
        String str1 = "000000147";
        if (str1.equalsIgnoreCase(str)) {
            System.out.println("str==str1");
        }
    }
}
