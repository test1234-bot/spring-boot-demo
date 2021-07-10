package com.example.demo.atguigu;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abcdefghijklmnopqrstuvwxzy");
        list.add("12345467890");
        list.add("aa");
        list.add("bb");
        list.add("c");
        list.add("dd");
        list.add("ee");
        list.add("ff");
        list.add("gg");

        List list1 = list.subList(0, 5);
        for (int i = 0; i < list1.size(); i++
        ) {
            System.out.println(list1.get(i));
        }
    }
}
