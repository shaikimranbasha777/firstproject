package JavaClass.day6;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList{

    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.add("imran");
        list.add("Malik");
        list.add("Raj");
        list.addFirst("Shaik");
        list.addLast("Basha");

        list.remove("Imran");

       /* Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        list.poll();
        list.contains(list);
        list.peek();
        list.peekFirst();
        list.peekLast();
        list.pollFirst();
        list.pollLast();
        list.pop();
        list.toString();


        Iterator it1 = list.descendingIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}