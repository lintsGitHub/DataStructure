package priv.lint;


import java.util.ArrayList;
import java.util.List;

/*
* 模拟队列的工作原理
*
* 是先进先出（FIFO, First-In-First-Out）的线性表
* */
public class MyQueue {
    private List<Object> list = new ArrayList<>();

    public void add(Object o){
        list.add(o);
    }

    public Object poll() throws Exception {

        if(list.isEmpty())
            throw new Exception("队列为空");
        else
            return list.get(0);
    }
}
