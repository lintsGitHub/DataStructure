package priv.lint;

import java.util.Stack;

public class StackAPI {
    public static void main(String[] args) {
        /*
        * 简单使用Stack的API
        * 在官方文档中Stack提供了五个方法给我们
boolean empty()  测试此堆栈是否为空。
E peek() 查看此堆栈顶部的对象，而不从堆栈中删除它。
E pop() 删除此堆栈顶部的对象，并将该对象作为此函数的值返回。
E push(E item) 将项目推送到此堆栈的顶部。
int search(Object o) 返回一个对象在此堆栈上的基于1的位置。
        * */
        Stack<Integer> stack = new Stack<>();
        System.out.println("栈中是否为空==" + stack.empty());
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.push(i));
        }
        System.out.println("栈中是否为空==" + stack.empty());
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }

        System.out.println("===========");
        stack.push(2);
        stack.push(1);
        System.out.println(stack.search(1));


    }
}
