package JavaClass.day5;

import java.util.Scanner;

public class MainBranch implements BankInterface{

    String mainBankName;
    String mianBankId;
    long mainBankPhno;
    long mainBankTotalFund;
    float mainBankIntrest;
    MainBranch approvedUsers[];
    //String userName;

    Scanner sc = new Scanner(System.in);
    String userName;
    long loan;
    int count=0;
    Object interest;
    int age;
    String place;

    @Override
    public void checkLoan(long branchTotalFund, float branchIntrest) {
        //if (loan < mainBankTotalFund){
            if (count < approvedUsers.length){
                for (int i=0;i<approvedUsers.length;i++){
                    MainBranch user = new MainBranch();
                    
                    System.out.println("Enter Name");
                    user.userName = sc.next();
                    System.out.println("Enter Age");
                    user.age = sc.nextInt();
                    System.out.println("Enter Location");
                    user.place = sc.next();
                    System.out.println("Enter loan ammount");
                    user.loan = sc.nextLong();
                    if (loan < branchTotalFund && branchTotalFund < mainBankTotalFund){
                        System.out.println("Loan Approved");
                        approvedUsers[i] = user;
                    }else{
                        System.out.println("Loan Not Approved");
                    }
                    float interest = totalIntrest(mainBankIntrest, branchIntrest);
                    user.interest = interest;
                    count++;
                }
            }else{
                System.out.println("No More Loans will be given");
           }
    }

    @Override
    public float totalIntrest(float mainBankIntrest, float branchIntrest) {
        float totalIntrest = mainBankIntrest + branchIntrest;
        
        return (totalIntrest);
    }

    @Override
    public void displayUser() {
        
        try{
            for (MainBranch each : approvedUsers){
                System.out.println("Approved user name " + each.userName);
                System.out.println("Approved loan " + each.loan);
                System.out.println("Loan Intrest " + each.interest);
            }
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
        
    }
/*
    @Override
    public void addUser() {
        if (count < approvedUsers.length){
            for (int i=0;i<approvedUsers.length;i++){
                MainBranch user = new MainBranch();

                //System.out.println("Loan Approved");
                //float interest = totalIntrest(mainBankIntrest, branchIntrest);
                
                System.out.println("Enter Name");
                user.userName = sc.next();
                //user.name = sc.next();
                System.out.println("Enter Age");
                user.age = sc.nextInt();
                System.out.println("Enter Location");
                user.place = sc.next();
                
                //user.loan = loan;
                //user.interest = interest;
    
                approvedUsers[i] = user;
                //displayUser();
                System.out.println(approvedUsers[0]);

                count++;
            }
        }else{
            System.out.println("No More Loans will be given");
        }
        
    }*/
    
}
