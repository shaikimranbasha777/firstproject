package JavaClass.JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Account implements AccountInterface{
    ArrayList<Transcation> trasaction = new ArrayList<Transcation>();
    long accountNo = 0;
    float accountBal = 0;
    String accountType = "";

    Scanner sc = new Scanner(System.in);

    @Override
    public Account addAccount() {
        System.out.println("Enter account number");
        this.accountNo = sc.nextLong();
        System.out.println("Enter account balence");
        this.accountBal = sc.nextFloat();
        System.out.println("Enter account type");
        this.accountType = sc.next();

        return this;
    }

    @Override
    public void deleteAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void searchAccount() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void editAccount() {
        // TODO Auto-generated method stub
        
    }
     public void Transcation(){
        for (Transcation obj : trasaction){
            System.out.println("Transaction Date " + obj.transcationDate);
            System.out.println("Transaction type " + obj.transcationType);
            System.out.println("Transaction Ammount " + obj.transcationAmmount);
            System.out.println("Current Balance " + obj.currentBal);
        }
     }
}
