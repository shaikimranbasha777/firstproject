package JavaClass.day6.MapTask;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class HelperClass {
    
    //private static final Object Rollnumber = null;


    HashMap<String, Student> map = new HashMap<String, Student>();
    

    static boolean exit = true;

    static Scanner sc = new Scanner(System.in);

    public void addStudent(){
       
        System.out.println("Enter Name");
        Object name = sc.next();
        //map.put(0,name);

        System.out.println("Enter Roll number");
        String rollNumber = sc.next();
        //map.put(1,rollNumber);

        System.out.println("Enter Place");
        Object place = sc.next();
        //map.put(2,place);

        System.out.println("Enter Branch");
        Object branch = sc.next();
        //map.put("Branch",branch);

        System.out.println("Enter Colage");
        Object collage = sc.next();
        //map.put("Collage",collage);
        
        //Student stu = new Student(name, rollNumber, place, branch, collage);
        map.put("Name",(Student) name);
        map.put("Rollnumber",Student.rollNumber);
        map.put("Place",(Student) place);
        map.put("branch",(Student) branch);
        map.put("Collage",(Student) collage);

        System.out.println((map).entrySet());
    }

    /**
     * 
     */
    public void serachStudent(){
        
        System.out.println(Student.rollNumber);
        System.out.println("Enter Roll Number");
        Object rollNum = sc.next();
        if (Student.rollNumber == rollNum){
            System.out.println("Studen");
        }else{
            System.out.println("Student Not Found");
        }

        /*for (Entry<String, String> m : map.entrySet()){
            //System.out.println(m.getValue());
            System.out.println("Enter Roll Number");
            String rollNum = sc.next();
            if (Student.rollNumber == rollNum){
                System.out.println("Student: " + m.getValue());
            }else{
                System.out.println("Student Not Found");
            }
            /*System.out.println("Student Name : " + m.getValue());
            System.out.println("Student Roll Number : " + m.getValue());
            System.out.println("Student Place : " + m.getValue());
            System.out.println("Student Branch : " + m.getValue());
            System.out.println("Student Collage : " + m.getValue());
            /*if (m.getKey() == "Roll Number"){
                System.out.println("Enter Roll Number");
                String rollNum = sc.next();
                if (m.getValue() == rollNum){
                    System.out.println("Student Name : " + m.getValue());
                    System.out.println("Student Roll Number : " + m.getValue());
                    System.out.println("Student Place : " + m.getValue());
                    System.out.println("Student Branch : " + m.getValue());
                    System.out.println("Student Collage : " + m.getValue());
                }else{
                    System.out.println("Student Not Found");
                }
           }
        }*/
    }

    public void deleteStudent(){
        /*for (Entry<String, Student> m : map.entrySet()){
            
            //if (m.getKey() == "Roll Number"){
                /*System.out.println("Enter Roll Number");
                String rollNum = sc.next();
                if (m.getValue() == rollNum){
                    map.remove(m);
                    System.out.println("Student removed sucssesfully");
                }else{
                    System.out.println("Student Not Found");
                }
           // }
        }*/
    }

    public static void main(String[] args) {
        HelperClass stu = new HelperClass();
        while(exit){
            System.out.println("Enter Choice \n 1.Add student \n 2.search student \n 3.delete student\n 4.Exit.");
            int choice = sc.nextInt();
            switch(choice){
                case 1: stu.addStudent();
                break;
                case 2: stu.serachStudent();
                break;
                case 3: stu.deleteStudent();
                break;
                case 4: System.out.println("Exit");
                exit = false;
                default: System.out.println("Plese Enter Valid Choice");


            }
            
        }
    }
}
