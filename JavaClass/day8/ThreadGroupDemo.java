package JavaClass.day8;

public class ThreadGroupDemo {
   

    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("Group 1");
        Threadsgroup obj = new Threadsgroup();
        Thread t1 = new Thread(g1, obj, "1");
        Thread t2 = new Thread(g1, obj, "2");
        Thread t3 = new Thread(g1, obj, "3");
        Thread t4 = new Thread(g1, obj, "4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
