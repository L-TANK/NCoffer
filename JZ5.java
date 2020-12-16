package com.LY.JZ;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class JZ5 {

    public static void main(String[] args) {
        StacktoList stacktoList = new StacktoList();
        stacktoList.push(1);
        stacktoList.push(2);
        System.out.println(stacktoList.pop());
        System.out.println(stacktoList.pop());
    }

}

class StacktoList {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(stack1.size() != 0)
        {
            int j = stack1.pop();
            stack2.push(j);
        }
        int k = stack2.pop();
        while(stack2.size() != 0)
        {
            int j = stack2.pop();
            stack1.push(j);
        }
        return k;
    }
}