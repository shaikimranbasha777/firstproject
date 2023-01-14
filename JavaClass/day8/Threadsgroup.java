package JavaClass.day8;

public class Threadsgroup extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
