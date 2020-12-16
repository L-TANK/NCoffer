package com.LY.JZ;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 解法1：暴力找最小值 不符合题意 此处不写
 * 解法2：二分法寻找最小值
 */
public class JZ6 {
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(a));
    }

    public static int minNumberInRotateArray(int [] array) {
        //二分解法
        int left = 0;
        int right = array.length - 1;//定义左右指针
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if(right - left == 1) return array[right];//若右指针位于左指针右侧一位 则右指针为最小数字
            else if(array[left] <= array[mid]) left = mid;//左指针居中
            else right = mid;//右指针居中
        }
        return 0;
    }
}

