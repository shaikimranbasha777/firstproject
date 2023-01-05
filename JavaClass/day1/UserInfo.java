

import java.util.Scanner;

class UserInfo {
    public String name;
    protected int age;
    public String place;
    public String companyName;
    private int userId;
    public String position;
    
    public void createUser(UserInfo user1){
        System.out.println("Enter User Details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        user1.name = sc.next();
        System.out.println("Enter Age");
        user1.age = sc.nextInt();
        System.out.println("Enter Location");
        user1.place = sc.next();
        System.out.println("Enter Company Name");
        user1.companyName = sc.next();
        System.out.println("Enter UserId");
        user1.userId = sc.nextInt();
        System.out.println("Enter Position");
        user1.position = sc.next();
        System.out.println("User Created Sucssefully");
    }

    public void displayUser(UserInfo user1){
        
        System.out.println(user1.name);
        System.out.println(user1.age);
        System.out.println(user1.place);
        System.out.println(user1.companyName);
        System.out.println(user1.userId);
        System.out.println(user1.position);
    }
    public static void main(String args[]) {
        UserInfo user1 = new UserInfo();
        user1.createUser(user1);
        user1.displayUser(user1);
    }
}
