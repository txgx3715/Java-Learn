package third;

import java.util.Scanner;

public class 中奖号码判断 {
    public static void main(String args[]) {
        int num = 0;
        System.out.println("请输入您的号码 ：");
        Scanner reader = new Scanner(System.in);
        num = reader.nextInt();
        switch (num) {

            case 913112:
                System.out.println("恭喜，三等奖");
                    break;
            case 20959627:
                System.out.println("恭喜，二等奖");
                    break;
            case 87531659:
                System.out.println("恭喜，一等奖");
                    break;
            default:
                System.out.println("没中奖");

//switch需要注意：swithc语句中表达式的值可以是byte，short，int，char型，但不可以是long型数据
        }
    }
}
