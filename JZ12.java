package com.LY.JZ;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class JZ12 {
    public static void main(String[] args) {
        System.out.println(Power(2.0,3));
    }

    public static double Power(double base, int exponent) {
        //显然题目不是要你直接调用包函数的
        //return Math.pow(base,exponent);
        //非递归快速幂法
        //遍历n的二进制位，是1就乘进结果
        //原理：X^6 = X^4 * X^2;6 = 110
        if(exponent < 0){
            base = 1 / base;
            exponent = -exponent;
        }
        double x = base;
        double ret = 1.0;
        while(exponent != 0){
            if((exponent & 1) != 0){//若该数二进制末尾为1 则将x成入结果中
                ret *= x;
            }
            x *= x;//每次都做平方处理
            exponent >>= 1;//指数做右移操作
        }
        return ret;
    }
}
