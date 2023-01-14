package JavaClass.day8;

public class Thread4 extends Thread {
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread 4 : " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
