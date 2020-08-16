package third;

public class 位运算 {
    //位：二进制位，简称“位”。是二进制记数系统中表示小于2的整数的符号，一般用1或 0表示，是具有相等概率的两种状态中的一种。
    // 二进制位的位数可表示一个机器字的字长，一个二进制位包含的信息量称为一比特（bit）。
    //举个栗子：
    //int占4个字节（byte）
    //1byte = 8bit
    //换算下来，一个int类型即占32bit
    //int i = 88; 这里的88为十进制，转换为二进制为：1011000，使用完整的32位表示即为：00000000 00000000 00000000 01011000
    //在计算机内，有符号数有三种表示法：原码、反码以及补码。



    //原码：就是二进制定点表示法，即最高位为符号位，“0”正负“1”，其余位表示数值的大小。
    //反码：正数的反码与其原码相同；负数的反码是对正数逐位取反，符号位保持为1。
    //补码：正数的补码与其原码相同；负数的补码是在其反码的末位加1。

    //示例如下：
    //同样的，我们使用 “88” 举例说明原码、反码以及补码。
    //“88”的原码：00000000 00000000 00000000 01011000
    //“88”的反码：00000000 00000000 00000000 01011000
    //“88”的补码：00000000 00000000 00000000 01011000
    //对于负数 “-88”，其原码、反码以及补码如下：
    //“-88”的原码：10000000 00000000 00000000 01011000
    //“-88”的反码：11111111 11111111 11111111 10100111
    //“-88”的补码：11111111 11111111 11111111 10101000

    //在计算机系统中，数值一律用补码来表示和存储。原因在于，使用补码，
    // 可以将符号位和数值域统一处理；同时，加法和减法也可以统一处理。此外，补码与原码相互转换，其运算过程是相同的，
    // 不需要额外的硬件电路。


    /**位运算符的基本运算：
     * A = 8,B = 9
     * 1.按位与&：如果相对应位都是1，则结果为1，否则为0
     * 例子：A&B=8，即1000
     *2.按位或|：如果相对应位都是0，则结果为0，否则为1
     * 例子：A|B=9，即1001
     * 3.按位异或^：如果相对应位值相同，则结果为0，否则为1
     * 例子：A^B=1，即0001
     * 4.按位取反~:按位取反运算符翻转操作数的每一位，即0变成1，1变成0
     * 例子：~A=7，即0111
     */

}
