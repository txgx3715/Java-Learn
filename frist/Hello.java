package com.frist;
//一个java程序中必须有一个类含有public static void main(String args[])方法，称这个类是应用程序的主类
//args[] 是main方法的一个参数，是一个字符串类型的数组
public class Hello {
    public static void main (String args[]) {
        System.out.println("大家好");
        System.out.println("Nice to meet you!");
        Student stu = new Student();
        stu.speak("We are students");
    }
}
class Student{
    public void speak(String s){
        System.out.println(s);
    }
}
