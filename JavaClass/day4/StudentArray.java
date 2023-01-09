package JavaClass.day4;

import java.util.Scanner;

public class StudentArray {
    String name;
    int age;
    String location;
    String collage;
    StudentArray arrayOfStudent[];
    static int count=0;
    static boolean exit=true;
    static Scanner sc = new Scanner(System.in);

    void addStudent(){

        if (count < arrayOfStudent.length){
            for (int i=0; i<arrayOfStudent.length;i++){
                StudentArray stu = new StudentArray();
    
                System.out.println("Enter Student Details");
                
                System.out.println("Enter Student Name");
                stu.name = sc.next();
                System.out.println("Enter Student Age");
                stu.age = sc.nextInt();
                System.out.println("Enter Student Location");
                stu.location = sc.next();
                System.out.println("Enter Student Collage Name");
                stu.collage = sc.next();
                
                arrayOfStudent[i] = stu;
                count++;
            }
           
        }
        else{
            System.out.println("No More Students will be taken");
        }
    }

    void displayStudentDetails(){
        System.out.println("Enter index to show Student Details");
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index");
        int index = sc.nextInt();

        if (index > arrayOfStudent.length){
            System.out.println("Index Value is out of Range");
        }else{
            /*for (StudentArray each : arrayOfStudent){
                System.out.println(each.name);
            }*/
            System.out.println("Student Name: " + arrayOfStudent[index].name);
            System.out.println("Student Age: " + arrayOfStudent[index].age);
            System.out.println("Student Location: " + arrayOfStudent[index].location);
            System.out.println("Student Collage: " + arrayOfStudent[index].collage);
            
        }
        
    }

    public static void main(String args[]){
        StudentArray stu1 = new StudentArray();

        System.out.println("Enter Number Of students");
        int noOfStudents = sc.nextInt();

        stu1.arrayOfStudent = new StudentArray[noOfStudents];
        
        while(exit){
            System.out.println("Enter Choice");
            //Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                stu1.addStudent();
                break;
                case 2:
                stu1.displayStudentDetails();
                break;
                case 3:
                System.out.println("Exit");
                exit = false;
                break;

            }
       }
    }


}
