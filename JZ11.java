package com.LY.JZ;

/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * 输入：10 二进制：1010
 * 输出：2
 */
public class JZ11 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(10));
    }
    //原理：1010 - 0001 = 1001; 1001 & 1010 = 1000 每次执行该操作都能去掉一个1
    public static int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
