package JavaClass.day8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        ThreadPool t1 = new ThreadPool();
        for (int i=0;i < 10; i++){
            Runnable t2 = new ThreadPoolDemo();
            pool.execute(t2);
        }
        pool.shutdown();
        

    }
}
