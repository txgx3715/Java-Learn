package third;

public class 将数字之间的值进行大小互换 {
    public static void main(String args[]) {
        int a =9,b=6,c=5,t=0;
        if(b<a) {
            t =a;
            a =b;
            b =t;
        }
        if(a>c) {
            t =a;
            a =c;
            c =t;
        }
        if(b<c) {
            t =c;
            c =b;
            b =t;
        }
        System.out.println("a:"+a+" b:"+b+" c:"+c);
    }
}
