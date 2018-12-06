package priv.lint;

import java.util.ArrayList;
import java.util.List;
/*
* 简单了解一下栈，
* 它一个数据结构
* 原理非常简单：
* 栈（stack）又名堆栈，它是一种运算受限的线性表。
* 其限制是仅允许在表的一端进行插入和删除运算。这一端被称为栈顶，
* 相对地，把另一端称为栈底。向一个栈插入新元素又称作进栈、入栈或压栈，
* 它是把新元素放到栈顶元素的上面，使之成为新的栈顶元素；从一个栈删除元素又称作出栈或退栈
* 它是把栈顶元素删除掉，使其相邻的元素成为新的栈顶元素。
* */
public class MyStack {
//    设计一个栈容器
    private List<Object> list = new ArrayList<>();

//    入栈方法
    public void push(Object o ){
        list.add(o);
    }

//    出栈方法
    public Object pop(){
        int size = list.size();
        Object o = list.get(size - 1);
        list.remove(o);
        return o;
    }

}
