package com.second;

public class 输出基本型数据2 {
    /**System.out.println()或System.out.print()可输出串值，表达式的值
     * 两者区别为前者换行后者不换行
     * 允许使用并置符号+将变量，表达式或一个常数值与一个字符串并置一起输出
     * */
    public static void main(String args[]) {

        //System.out.println(m+"个数的和为"+sum);等等

        /*一个特别注意的地方：sout输出字符常量时不可使用回车
        如：System.out.println("你好，
                                    很高兴认识你");此种属于错误的形式
        不过如果将长字符串差成几个短的字符串，则是可行的如："A"+
                                                    "BC"
        * */

        /**System.out.println("格式控制部分"，表达式1，表达式2，...，表达式n)
         * 格式控制部分由格式控制符号%d,%c,%f,%s和普通的字符组成，普通字符原样输出，格式符号用来输出表达式的值。
         * %d:输出int类型数据.
         * %c:输出char型数据。
         * %f:输出浮点型数据，小数部分最多保留6位。
         * %s:输出字符串数据。
         * 输出数据时也可以控制数据在命令行的位置，如：
         * %md:输出的int型数据占m列.
         * %m.nf:输出的浮点型数据占m列，小数点保留n位。
         *
         * */

            System.out.printf("%d,%f",12,23.78);


    }
}
