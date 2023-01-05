package JavaClass.day2;

class CollageTask {
    String collageName;
    int collageId;
    String collagePlace;

    public CollageTask(String collageName, int collageId, String collagePlace) {
        this.collageName = collageName;
        this.collageId = collageId;
        this.collagePlace = collagePlace;
    }

    public void dispalyCollageDetails(){
        System.out.println("Collage Name = " + collageName);
        System.out.println("Collage Id = " + collageId);
        System.out.println("Collage Location = " + collagePlace);
    }
}

class Branch extends CollageTask {
    String branchName;
    int branchId;
    int onOfStaf;

    public Branch(String collageName, int collageId, String collagePlace, String branchName, int branchId,
            int onOfStaf) {
        super(collageName, collageId, collagePlace);
        this.branchName = branchName;
        this.branchId = branchId;
        this.onOfStaf = onOfStaf;
    }

    public void dispalyBranchDetails(){
        System.out.println("Branch Name = " + branchName);
        System.out.println("Branch Id = " + branchId);
        System.out.println("No Of Staf = " + onOfStaf);
    }
}

class Student extends Branch {
    String studentName;
    int studentId;
    String studentPlace;

    

    public Student(String collageName, int collageId, String collagePlace, String branchName, int branchId,
            int onOfStaf, String studentName, int studentId, String studentPlace) {
        super(collageName, collageId, collagePlace, branchName, branchId, onOfStaf);
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentPlace = studentPlace;
    }

    public void dispalyStudentDetails(){
        System.out.println("Student Name = " + studentName);
        System.out.println("Student Id = " + studentId);
        System.out.println("Student Location = " + studentPlace);
        System.out.println("Collage Name = " + collageName);
        System.out.println("Collage Id = " + collageId);
        System.out.println("Collage Location = " + collagePlace);
        System.out.println("Branch Name = " + branchName);
        System.out.println("Branch Id = " + branchId);
        System.out.println("No Of Staf = " + onOfStaf);
    }

    public static void main(String args[]){
        Student stu1 = new Student("Nagarjuna", 1, "Bangalore", "Civil Engneering", 25, 10, "Imran", 122, "Kurnool");

        stu1.dispalyStudentDetails();
        stu1.dispalyCollageDetails();
        stu1.dispalyBranchDetails();
    }
}