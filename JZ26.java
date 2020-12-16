package com.LY.JZ;

import java.util.ArrayList;
/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 *      2
 *    /  \
 *   1   4  ->   1<->2<->3<->4
 *      /
 *      3
 *
 *  解法1 递归从右子树开始反向修改节点指针
 *  解法2 中序遍历后 顺序修改节点指针
 */
public class JZ26 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNodel = new TreeNode(1);
        TreeNode treeNoder = new TreeNode(4);
        TreeNode treeNodel2 = new TreeNode(3);
        treeNoder.left = treeNodel2;
        treeNode.left = treeNodel;
        treeNode.right = treeNoder;
        TreeNode treeNode1 = Convert(treeNode);
        while (treeNode1 != null){
            System.out.print(treeNode1.val + " ");
            treeNode1 = treeNode1.right;
        }

    }
    //解法1
    static TreeNode pre=null;//用一个全局变量去保存前一个节点，然后再去创建节点之间的关系
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        Convert(pRootOfTree.right);
        if (pre!= null){//只要pre不空，就创建关系，创建后就是链表了,左节点为上一个，右节点为下一个
            pRootOfTree.right=pre;
            pre.left=pRootOfTree;
        }
        pre=pRootOfTree;
        Convert(pRootOfTree.left);
        return pre;
     }

/**
------------------------------------------------------------------------------------------
*/

//    //解法2
//    public static TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null){
//            return null;
//        }
//        ArrayList<TreeNode> list = new ArrayList<>();
//        ConvertMid(pRootOfTree, list);
//        return ConvertHelper(list);
//
//    }
//    //中序遍历，在list中按遍历顺序保存
//    public static void ConvertMid(TreeNode pRootOfTree, ArrayList<TreeNode> list){
//        if(pRootOfTree.left != null){
//            ConvertMid(pRootOfTree.left, list);
//        }
//
//        list.add(pRootOfTree);
//
//        if(pRootOfTree.right != null){
//            ConvertMid(pRootOfTree.right, list);
//        }
//    }
//    //遍历list，修改指针
//    public static TreeNode ConvertHelper(ArrayList<TreeNode> list){
//        for(int i = 0; i < list.size() - 1; i++){
//            list.get(i).right = list.get(i + 1);
//            list.get(i + 1).left = list.get(i);
//        }
//        return list.get(0);
//    }
}



