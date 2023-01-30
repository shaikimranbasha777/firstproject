package DesignPattrens.day16.StructuralPattrens.ProxyPattrens;

public class RealVideo implements VideoInterface {
String videoAddress;

RealVideo(String videoAddress){
    this.videoAddress = videoAddress;
}
    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Play the video of " + videoAddress);
    }
    
}
