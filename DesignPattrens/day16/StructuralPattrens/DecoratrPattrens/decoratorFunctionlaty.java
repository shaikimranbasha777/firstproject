package DesignPattrens.day16.StructuralPattrens.DecoratrPattrens;

public class decoratorFunctionlaty extends DecoratorShape {

    decoratorFunctionlaty(ShapeInterface obj) {
        super(obj);
        //TODO Auto-generated constructor stub
    }

    public void BorderColor(String color, ShapeInterface decoratorShape){
        System.out.println("$color Shape");
        decoratorShape.drawShape();
    }
    
}
