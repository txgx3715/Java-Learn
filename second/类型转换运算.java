package com.second;

public class 类型转换运算 {
    public static void main(String args[]) {
        /**按照基本类型精度从低到高为：
         * byte short char int long float double
         * 把级别低的变量的值赋给级别高的变量时，系统自动完成数据类型的转换。
         * */
        float n = 100;
        //其输出值为100
        int x = 50;
        float y = x;
        System.out.println(y);

        /**把级别高的变量的值赋给级别低的变量时，必须使用类型转换运算。
         *(类型名)要转换的值；
         * */
        int x1 = (int)34.89;
        long y1 = (long)56.96F;
        int z = (int)1999L;
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z);

        //当把一个int型常量赋值给一个bute，short和char型变量时，不可超过这些变量的取值范围，否则必须进行类型转换运算。
        byte a = (byte)128;
        byte b = (byte)(-129);
        System.out.println(a);
        System.out.println(b);
        //a,b的值为-128与127
        //常见的错误：把一个double型常量赋值给float型变量美进行类型转换运算
        //float x2 = 12.4; 为错误的形式
        float x3 = (float)12.4;


    }
}
