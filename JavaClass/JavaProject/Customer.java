package JavaClass.JavaProject;

import java.util.Scanner;

public class Customer implements CustumerInterface {
    public Account account;
    String custumerName;
    int id;
    String email;
    long password;
    long phno;
    long cardNo;
    String address;

    Scanner sc = new Scanner(System.in);

    @Override
    public void addCustmer() {
        System.out.println("Enter name");
        this.custumerName = sc.next();
        System.out.println("Enter customer Id");
        this.id = sc.nextInt();
        System.out.println("Enter Customer Email");
        this.email = sc.next();
        System.out.println("Enter Password");
        this.password = sc.nextLong();
        System.out.println("Enter card number");
        this.cardNo = sc.nextLong();
        System.out.println("Enter Phone number");
        this.phno = sc.nextLong();
        System.out.println("Enter Address");
        this.address = sc.next();

        account = new Account().addAccount();
    }

    @Override
    public void deleteCustmer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void searchCustmer() {
        // TODO Auto-generated method stub
        
    }
    
}
