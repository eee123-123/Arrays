import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackQueue {
    public static void main(String[] args) {
        //栈
        Stack stack=new Stack();
        //双端队列,可以作栈来用
        Deque deque;//ArrayDeque 底层是数组，LinkedList 底层是链表
        //队列
        Queue queue;//ArrayDeque 底层是数组，LinkedList 底层是链表

        Deque deque1=new LinkedList();
        deque1.push("盘子1");
        deque1.push("盘子2");
        System.out.println(deque1.peek());
        deque1.push("盘子3");
        while(!deque1.isEmpty()){
            String elem=(String) deque1.pop();
            System.out.println(elem);
        }

    }
}
