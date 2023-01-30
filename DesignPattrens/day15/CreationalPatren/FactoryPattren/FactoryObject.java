package DesignPattrens.day15.CreationalPatren.FactoryPattren;

public class FactoryObject {
    
    public FactoryInterface drawTheShape(String shape){
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("Rectangle")){
            return new FactoryRectangle();
        }
        if (shape.equalsIgnoreCase("Triangle")){
            return new FactroyTriangle();
        }
        return null;
        
    }
}
