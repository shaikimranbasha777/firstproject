package JavaClass.JavaProject;

import java.util.Scanner;

public class Atm implements AtmIterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public Customer deposite(Customer user) {
        
        System.out.println("enter your deposit amount");
        float amount = sc.nextFloat();
        user.account.accountBal = user.account.accountBal + amount;
        System.out.println(user.account.accountBal);
        Transcation transaction = new Transcation();
        transaction.addTranscation("deposite", amount,  user.account.accountBal);
        user.account.trasaction.add(transaction);
        return user;
        
    }

    @Override
    public Customer withdraw(Customer user) {
        System.out.println("Enter card nummber");
        long cardNo = sc.nextLong();
        System.out.println("Enter pin");
        long password = sc.nextLong();
        if (cardNo == user.cardNo && password == user.password){
            System.out.println("enter your withdraw amount");
            float amount = sc.nextFloat();
            if (amount < user.account.accountBal && (user.account.accountBal-amount)> 10000){
                user.account.accountBal = user.account.accountBal - amount;
                System.out.println(user.account.accountBal);
                Transcation transaction = new Transcation();
                transaction.addTranscation("withdraw", amount,  user.account.accountBal);
                user.account.trasaction.add(transaction);
            }else{
                System.out.println("Your balnce is should not below 10000");
            }
        } else{
            System.out.println("your credentials wrong");
            System.out.println(user);
            System.out.println(user.cardNo);
        }
        return user;
    }

    @Override
    public Customer checkBal(Customer user) {
        System.out.println(user.account.accountBal);
        Transcation transaction = new Transcation();
        transaction.addTranscation("Check Balance", 0,  user.account.accountBal);
        user.account.trasaction.add(transaction);
        return user;
    }
    
}
