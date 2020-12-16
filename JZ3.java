package com.LY.JZ;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 输入：{67,0,24,58}
 * 输出：[58,24,0,67]
 * 解法：利用栈进行首位倒置 最后逐个取出存入list中
 */
public class JZ3 {

    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(67);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(printListFromTailToHead(listNode0));
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null)
        {
            Integer b = Integer.valueOf(listNode.val);
            stack.push(b);
            listNode = listNode.next;
        }
        while(!stack.empty()) //非空则一直添加
            array.add(stack.pop());
        return array;
    }
}


