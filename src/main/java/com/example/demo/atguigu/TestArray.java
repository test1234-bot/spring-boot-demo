package com.example.demo.atguigu;

public class TestArray {

    public static void main(String[] args) {

        int[] array = {1, 24, 12, 89, -12, 89, 65};

        System.out.println("排序前：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println();
        System.out.println("排序：");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("排序后：");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }


}
