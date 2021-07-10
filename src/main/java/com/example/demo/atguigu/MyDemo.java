package com.example.demo.atguigu;

public class MyDemo {

    public static void main(String[] args) {

        int a = 4;
        int b = ++a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
        int c = 4;
        int d = c++;
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        System.out.println("===========位运算===========");
        int i = 2;

        System.out.println(i << 3);

        System.out.println("*********九九乘法表********");

        for (int j = 1; j <= 9; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(j + " * " + k + " = " + (j * k) + "\t");
            }
            System.out.println();
        }

        System.out.println("********100以内的质数**************");

        long statTime = System.currentTimeMillis();
        a:
        for (int j = 2; j < 100000; j++) {
            for (int k = 2; k < Math.sqrt(j); k++) {
                if (j % k == 0) {
                    continue a;
                }
            }

            System.out.println("质数：" + j);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("共消耗：" + (endTime - statTime));

    }
}
