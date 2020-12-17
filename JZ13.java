package com.LY.JZ;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 解法1：暴力遍历解
 */
public class JZ13 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reOrderArray(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reOrderArray(int [] array) {
        int n = array.length;
        int count = 0;//偶数个数
        for(int i = 0;i < n;i++)
        {
            if(array[i] % 2 == 0)
                count++;
        }
        int[] a = new int [n - count];//奇数数组
        int[] b = new int [count];//偶数数组
        int p = 0;
        int q = 0;
        for(int i  = 0;i < n;i++)
        {
            if(array[i] % 2 == 0)
            {
                b[q] = array[i];
                q++;
            }
            else
            {
                a[p] = array[i];
                p++;
            }
        }
        int x = 0;
        while(x < a.length)
        {
            array[x] = a[x];
            x++;
        }
        int y = 0;
        while(y < b.length)
        {
            array[x] = b[y];
            y++;
            x++;
        }
    }
}
