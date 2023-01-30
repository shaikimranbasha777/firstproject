package DesignPattrens.day16.StructuralPattrens.DecoratrPattrens;

public class DecoratorShape implements ShapeInterface {

    ShapeInterface decoratorShape;

    DecoratorShape(ShapeInterface obj){
        decoratorShape = obj;
    }

    

    @Override
    public void drawShape() {
        // TODO Auto-generated method stub
        decoratorShape.drawShape();
    }
    
}
