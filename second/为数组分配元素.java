package com.second;

public class 为数组分配元素 {
    public  static void  main(String args[]) {
        /*创建数组
         * 数组名 = new 数组元素类型 [数组元素个数];
         */
        float [] boy;
        boy = new float[4];
        //数组boy获得了4个用来存放float类型数据的变量，即四个float型元素。数组中存放着这些元素的首地址
        //通过数组变量的名字加索引来使用元素
        boy[0] = 12;
        boy[1] = 21;
        boy[2] = 543;
        boy[3] = 25.34f;

        /**
         * 声明数组与创建数组可以一起完成
         * float boy[] = new float[4];
         * 二维数组也相同
         * int mytwo[][] = new int[3][4];
         * 一个二维数组由若干个一维数组构成，上面的二维数组就是由3个长度为4的一维数组mytwo[0],mytwo[1],mytwo[2]构成
         *其中构成二维数组的一维数组不必有相同的长度，在创建二维数组时可以分别指定构成该二维数组的一维数组的长度
         * **/
        int a[][] = new int[3][];
        a[0] = new int[6];
        a[1] = new int[8];
        a[2] = new int[10];
    }
}
