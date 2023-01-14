package JavaClass.day8;

public class Thread3 extends Thread {
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread 3 : " + i);
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
