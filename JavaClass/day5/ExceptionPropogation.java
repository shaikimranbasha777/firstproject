package JavaClass.day5;

public class ExceptionPropogation {
    int num1 = 10;
    int num2;
    String name;
    
    void arithematic(){
        float divied = num1/num2 ;

        System.out.println(divied);
    }

    void nullPoint(){
        System.out.println(name);
    }

    public static void main(String args[]){
        ExceptionPropogation example = new ExceptionPropogation();

        try{
            example.arithematic();
            example.nullPoint();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
