package com.second;

public class 数组的引用 {
    int c [] = {1,2,3},d[] = {4,5};
    /*此时数组a,b分别存放着引用两个不同元素的首地址
    *如果使用下列赋值语句（a和b的类型必须相同）
    * a = b(注意，在计算机语言中，都是右边的值赋给左边的变量)
    * 此时在赋值之后，数组a与数组b的元素则变为相同
     */
    public static void main(String args[]) {
        int a[] = {1,2,3,4};
        int b[] = {100,200,300};
        System.out.println("数组a的元素个数= "+a.length);
        System.out.println("数组b的元素个数= "+b.length);
        System.out.println("a数组的引用："+a);
        System.out.println("b数组的引用："+b);
        System.out.println(a);
        a = b;
        System.out.println("数组a的元素个数= "+a.length);
        System.out.println("数组b的元素个数= "+b.length);
        System.out.println("a[0]="+a[0]+",a[1]="+a[1]+",a[2]="+a[2]);
        System.out.println("b[0]="+b[0]+",b[1]="+b[1]+",b[2]="+b[2]);
        //一个特殊需要注意的地方：对于char数组e,System.out.println(e)不会输出数组e的引用而是输出数组e的全部元素的值
        char e[] = {'中','国','科','大'};
        System.out.println(e);
        //如果想输出char型数组的引用，必须让数组a和字符串做并置运算，如
        System.out.println(""+e);

    }

}
