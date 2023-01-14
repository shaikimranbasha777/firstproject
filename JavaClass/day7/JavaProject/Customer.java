package JavaClass.day7.JavaProject;

import java.util.Scanner;

public class Customer implements CustumerInterface {
    public Account account;
    public String custumerName;
    public int id;
    public String email;
    public long password;
    public long phno;
    public long cardNo;
    public String address;

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
    public void searchCustmer(Customer user) {
        displayCustomer(user);
        
    }

    public void displayCustomer(Customer user){
        System.out.println("Enter Customer Id");
        id = sc.nextInt();
        if (user.id == id){
            System.out.println("Customer Id " + user.id );
            System.out.println("Customer Name " + user.custumerName );
            System.out.println("Customer Email " + user.email);
            System.out.println("Customer Phone Number " + user.phno);
            System.out.println("Customer addres " + user.address);
            System.out.println("Customer Card Number " + user.cardNo);
            System.out.println("Customer Password " + user.password);
            System.out.println("Customer Account Number " + account.accountNo );
        }
        
    }

    public void editAccount(Customer user) {
        System.out.println("Update Your details");
        boolean exit = true;
        while(exit){
            System.out.println("1. Update name\n2.Update phone number\n3. Update email\n4.Update password\n5. Update address");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter name to update");
                    String custumerName = sc.next();
                    user.custumerName = custumerName;
                    break;
                case 2:
                    System.out.println("Enter phone number to update");
                    long phno = sc.nextLong();
                    user.phno = phno;
                    break;
                case 3:
                    System.out.println("Enter email to update");
                    String email = sc.next();
                    user.email = email;
                    break;
                case 4:
                    System.out.println("Please enter old pin");
                    long oldPin = sc.nextLong();
                    if (oldPin == user.password){
                        System.out.println("Enter password to update");
                        long password = sc.nextLong();
                        user.password = password;
                    }
                    
                    break;
                case 5:
                    System.out.println("Enter address to update");
                    String address = sc.next();
                    user.address = address;
                    break;
                case 6:
                    System.out.println("exit");
                    exit = false;
                default:
                    System.out.println("Enter valid choice");
                    
            }
        }
    }
        
}
