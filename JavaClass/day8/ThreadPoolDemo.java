package JavaClass.day8;

public class ThreadPoolDemo implements Runnable{
   
    private String message;

    public void WorkerThread(String name){
        this.message = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        
    }
}
