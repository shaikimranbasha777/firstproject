package DesignPattrens.day16.StructuralPattrens.DecoratrPattrens;

public class MainClass {
    public static void main(String[] args) {
        decoratorFunctionlaty decorator = new decoratorFunctionlaty(new Cricle());
        decorator.BorderColor("red", new Cricle());
        decorator.BorderColor("red", new Rectangle());
    }
}
