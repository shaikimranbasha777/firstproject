package JavaClass.day8;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        t2.start();
        /*try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t3.start();

    }
}
