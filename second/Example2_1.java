package com.second;

public class Example2_1 {
    public static void main (String args[]){
        char chinaWord = '好',japanWord = 'す';
        char you = '\u4F60';
        int position = 20320;
        System.out.println("汉字:"+chinaWord+"的位置："+(int)chinaWord);
        //Ctrl + D 复制当前一行文字至下一行
        System.out.println("日文:"+japanWord+"的位置："+(int)japanWord);
        System.out.println(position+"位置上的字符是："+(char)position);
        int position2 = 21319;
        System.out.println(position2+"位置上的字符是："+(char)position2);
        System.out.println("you:"+you);
        float weight = 1e-12F;
        System.out.println(weight);
    }
}
