package JavaClass.day6.MapTask;

public class Student {
    String name;
    String rollNumber;
    String place;
    String branch;
    String collage;
    public static String Collage;
    public Student(String name2, String rollNumber2, String place2, String branch2, String collage2) {
        this.name = name2;
        this.rollNumber = rollNumber2;
        this.place = place2;
        this.branch = branch2;
        this.collage = collage2;
    }
    
    void display(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll Number : " + this.rollNumber);
        System.out.println("Student Place : " + this.place);
        System.out.println("Student Branch : " + this.branch);
        System.out.println("Student Collage : " + this.collage);
    }
}
