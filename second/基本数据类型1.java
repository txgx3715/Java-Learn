package com.second;

public class 基本数据类型1 {
    /*基本数据类型又称简单数据结构，Java中有8种基本数据类型
   分别是:boolean,byte,short,char,int,long,float,double
   * 1.逻辑类型
   * 常量：true.false (boolean值)

   * 2.整数类型
   * 2.1 int型
   *   常量：十进制，八进制，十六进制
       int变量可以分配4个字节，取值范围为-2^31~2^31-1
    */
    int x = 12,y = 9898;
    /*
    *2.2 byte型
    * byte型变量分配分配1个字节内存，占八位
        常量：java中不存在byte型常量表示法，但可把一定范围的int型常量赋值给byte类型
        变量：使用关键字byte声明byte型变量，取值范围为-2^7~2^7-1
        若需强调一个整数byte型数据，可使用强制转换运算的结果表示，(byte)-12,(byte)18
    */
    byte z = -12,tom = 28,漂亮 = 30;
    /*2.3 short型
       short变量分配2个字节内存，占16位，short型变量的取值范围为-2^15~2^15-1
    *   常量：和byte类似，java不存在short型常量的表示方法，可把一定范围的int常量赋值给short变量
    *   变量：使用关键字short来声明short变量
        若需强调一个整数short型数据，可使用强制转换运算的结果表示，(short)-12,(short)18
        */
    short x1 = 12,y1 = 1234;
    /*2.4 long型
        常量：long型常量后缀L来表示，如108L(十进制)，07237L(八进制),0x3ABCL（十六进制）
        变量：long width = 12L,height = 2005L;
        long型变量，分配8个字节内存，占64位，long型变量的取值范围为-2^63~2^63-1
        */
    long width = 12L,height = 2005L;
    /*
      3.字符类型
      常量:单引号括起来的Unicode字符
      变量：使用关键字char来声明char型变量*/
    char nod = 'A',home = '家',handsome = '酷';
    /*char型变量分配2个字节内存,占16位，最高位不是符号位，没有负数的char。char型变量的取值范围为0~65535。*/
    char x2 = 'a';
    char y2 = 97;
    /*如上图例子，内存x中存储的是97，97是字符a在Unicode表中的排序位置，x2与y2在此处是一回事。
     *部分转义符常量：\n(换行)，\b(退格)，\t(水平制表)，\'（单引号），\"(双引号)，\\（反划线）
     */
    char x3 = '\n',ch2 = '\"',ch3 = '\\';

    /*在Java中可使用Unicode表中排序位置的十六进制转义(需要用u做前缀)来表示该字符
     //其格式一般为'\U****',如'\u0041'表示字符A,'\u0061'表示字符a。
     * 观察一个字符在Unicode表中的顺序位置，可使用int型类型转换，如(int)‘A’.
     * 如果要得到一个0~65535之间的数所代表的Unicode表中相应位置上的字符。必须使用char型转换，如(char)65。
     * */
}
