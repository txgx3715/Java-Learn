package third;

public class for语句与数组 {
    public static void main(String args[]) {
        int a[] = {1,2,3,4};
        //int i =0;0
        //需要注意的是，在for（声明循环变量：数组的名字）中的“声明循环变量”必须是变量声明，不可以使用已经声明过的变量
        for(int i :a) {     //循环变量i依次取数组a的每一个元素的值（改进方式）
            System.out.println(i);
        }
    }
}
