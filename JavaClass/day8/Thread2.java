package JavaClass.day8;

public class Thread2 extends Thread {
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread 2 : " + i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
