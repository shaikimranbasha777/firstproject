package JavaClass.day8;

public class Thread1 extends Thread{
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread 1 : " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
