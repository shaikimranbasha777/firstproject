package DesignPattrens.day15.CreationalPatren.FactoryPattren;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryObject obj = new FactoryObject();

        FactoryInterface shape = obj.drawTheShape("triangle");
        shape.draw();
    }
}
