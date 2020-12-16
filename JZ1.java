package com.LY.JZ;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 输入：
 * 7,
 * [[1,2,8,9],
 * [2,4,9,12],
 * [4,7,10,13],
 * [6,8,11,15]]
 * 输出： true
 *  解法1 暴力遍历 没有使用题目给出的条件
 *  解法2 从左上角到右下角进行检索
 */
public class JZ1 {

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},
                         {2,4,9,12},
                         {4,7,10,13},
                         {6,8,11,15}};
        System.out.println(Find(7,array));
    }
//    //解法1
//    public static boolean Find(int target, int [][] array) {
//        for (int i = 0; i < array.length; i++) //行
//        {
//            for (int j = 0; j < array[0].length; j++) //列
//            {
//                if (array[i][j] == target) return true;
//            }
//        }
//        return false;
//    }
    //解法2
    public static boolean Find(int target, int [][] array) {
        if (array == null) return false;
        int rows = array.length;//行
        int cols = array[0].length;//列
        if (rows <= 0 || cols <= 0) return false;
        int row = 0;
        int col = cols - 1;//从右上角开始检索
        while (row < rows && col >= 0) {//直到右下角停止
            if (array[row][col] == target) return true;//找到目标
            else if (array[row][col] < target) row++;//当前数字比目标小则进入下一行
            else col--;//当前数字比目标大则进入上一列
        }
        return false;
    }
}

