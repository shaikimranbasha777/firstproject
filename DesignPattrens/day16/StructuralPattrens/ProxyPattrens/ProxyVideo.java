package DesignPattrens.day16.StructuralPattrens.ProxyPattrens;

public class ProxyVideo implements VideoInterface{
    String realVideoAddress;
    RealVideo realVideo;

    ProxyVideo(String realVideoAddress){
        this.realVideoAddress = realVideoAddress;
    }
    @Override
    public void show() {
        // TODO Auto-generated method stub
        if(realVideo == null){
            realVideo = new RealVideo(realVideoAddress);
        }
        realVideo.show();
        
    }
    
}
