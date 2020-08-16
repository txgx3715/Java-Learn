package third;

public class for循环的简单演示 {
    public static void main(String args[]) {
        long sum = 0,a = 8,item = a,n = 12,i = 1;
        for(i=1;i<=n;i++) {
            sum = sum + item;
            item = item*10 +a;
        }
        System.out.println(sum);
        //for循环的执行顺序：for(1,2,3){4}
        // 执行顺序为1-2，2为true则2-4-3反复循环指导false为止
    }
}
