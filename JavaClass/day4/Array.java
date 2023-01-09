package JavaClass.day4;

public class Array {

    static int array[] = new int[5];
    public static void main(String args[]){
        
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        
        for (int each : array){
            System.out.println(each);
        }

        newArray(new int[] {1,2,3,4,5});


    }

    private static void newArray(int[] is) {
        //Object array;
        int array1[] = array.clone();
        System.arraycopy(is, 0, is, 0, 0);
        for (int each : array1){
            System.out.println(each);
        }
    }
    
}
