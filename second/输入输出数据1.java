package com.second;

import java.util.Scanner;

public class 输入输出数据1 {
   // Scanner reader = new Scanner(System.in);
    //reader 对象调用各种方法读取用户在命令行输入的各种基本类型数据：
    //nextBoolean(),nextByte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble()
    public static void main(String args[]) {//可称作小型累和计算器
        System.out.println("请输入若干个数，每输入一个数回车确认");
        System.out.println("最后输入数字0结束输入操作");
        Scanner reader = new Scanner(System.in);
        double num = 0;
        double sum = 0;
        double x = reader.nextDouble();
        while (x!=0) {
            sum = sum + x;
            x = reader.nextDouble();
        }

        System.out.println("sum="+sum);
    }
}
