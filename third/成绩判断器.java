package third;

public class 成绩判断器 {
    public static void main(String args[]) {
        int math = 65, english = 85;
        if (math > 60) {
            System.out.println("数学及格了");
        } else {
            System.out.println("数学不及格");
        }
        if (english > 85) {
            System.out.println("英语优秀了");
        } else {
            System.out.println("英语不优秀");
        }
    }
}
