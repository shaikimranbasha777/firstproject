package JavaClass.day6.MapTask;

public class Student {
    Student name;
    static Student rollNumber;
    Student place;
    Student branch;
    Student collage;
    public Student(Student name2, Student rollNumber2, Student place2, Student branch2, Student collage2) {
        this.name = name2;
        Student.rollNumber = rollNumber2;
        this.place = place2;
        this.branch = branch2;
        this.collage = collage2;
    }
    public Student(String name2, String rollNumber2, String place2, String branch2, String collage2) {
    }
    

    
}
