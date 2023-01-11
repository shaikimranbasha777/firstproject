package JavaClass.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    public static void main(String args[]){
        ArrayListDemo user = new ArrayListDemo();

        System.out.println("Enter Name");
        user.name = sc.next();
        System.out.println("Enter Age");
        user.age = sc.nextInt();

        ArrayListDemo user2 = new ArrayListDemo();

        System.out.println("Enter Name");
        user2.name = sc.next();
        System.out.println("Enter Age");
        user2.age = sc.nextInt();

        ArrayList<ArrayListDemo> list = new ArrayList<ArrayListDemo>();
        //list.setBit(0,user);
        list.add(user);
        list.add(user2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.get(0);// to get value in array
        // list.set(0,25);// to upadte value in array we use set()
        //list.addAll(1);
        /*for (ArrayListDemo each : list){
            System.out.println("user Name " + each.name);
            System.out.println("user age " + each.age);
         }*/
        ///System.out.println(list);
        //list[0] = user;
        
        /*Iterator it = list.iterator();
         while(it.hasNext()){
            //System.out.println("user Name " + it.name);
            //System.out.println("user age " + each.age);
            ArrayListDemo user3 = (ArrayListDemo) it.next();
            System.out.println("user Name " + user3.name);
            System.out.println("user age " + user3.age);
        }*/

        //System.out.println("user Name " + list.get(0).name);
        //System.out.println("user age " + list.get(0).age);

        // list.remove(0);
        //list.size(); //it will return length of array
        // list.isEmpty();
        // list.clear();
        ArrayList<ArrayListDemo> list1 = (ArrayList) list.clone();

        System.out.println("user Name " + list1.get(0).name);
        System.out.println("user age " + list1.get(0).age);
        
    }
}
