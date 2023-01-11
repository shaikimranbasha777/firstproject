package JavaClass.day6;

import java.util.Iterator;
import java.util.Stack;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<Integer>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(5);
        list.push(4);
        list.push(6);

        list.peek();
        list.toArray();
        
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(list.pop());
    }

}
