package JavaClass.day6;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        TreeSet<Integer> tree = new TreeSet<Integer>();

        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

    }
}
