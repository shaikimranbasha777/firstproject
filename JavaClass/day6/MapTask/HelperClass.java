package JavaClass.day6.MapTask;

import java.util.HashMap;
import java.util.Scanner;

public class HelperClass{
    HashMap<String, Student> map = new HashMap<String, Student>();

    static Scanner sc = new Scanner(System.in);

    public void addStudent(){
        System.out.println("Enter Name");
        String name = sc.next();

        System.out.println("Enter Roll number");
        String rollNumber = sc.next();
        while(map.containsKey(rollNumber)){
            System.out.println("Roll is Already presnt");
            System.out.println("Enter diffrent Roll number");
            rollNumber = sc.next();
        }

        System.out.println("Enter Place");
        String place = sc.next();

        System.out.println("Enter Branch");
        String branch = sc.next();

        System.out.println("Enter Colage");
        String collage = sc.next();
        
        Student stu = new Student(name, rollNumber, place, branch, collage);
        map.put(rollNumber,stu);
    }

    public void serachStudent(){
        System.out.println("Enter Roll Number");
        String rollNum = sc.next();
        if(map.containsKey(rollNum)){
            map.get(rollNum).display();;
        }else{
            System.out.println("Student not found");
        }
    }

    public void deleteStudent(){
        System.out.println("Enter Roll Number");
        String rollNum = sc.next();
        
        if(map.containsKey(rollNum)){
            Student stu = map.remove(rollNum);
            System.out.println("Student removed sucssesfully");
            stu.display();;
        }else{
            System.out.println("Student not found");
        }
    }

    public static void main(String[] args) {
        HelperClass stu = new HelperClass();
        while(true){
            System.out.println("Enter Choice \n 1.Add student \n 2.search student \n 3.delete student\n 4.Exit.");
            int choice = sc.nextInt();
            switch(choice){
                case 1: stu.addStudent();
                break;
                case 2: stu.serachStudent();
                break;
                case 3: stu.deleteStudent();
                break;
                case 4: System.exit(1);
                default: System.out.println("Plese Enter Valid Choice");

            }
            
        }
    }
}
