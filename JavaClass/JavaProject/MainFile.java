package JavaClass.JavaProject;

import java.util.Scanner;

public class MainFile {
    Bank bankObj = new Bank();

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MainFile main = new MainFile();
        Customer user = new Customer();
        while(true){
            System.out.println("1.Add customer\n 2.deposite ammount \n 3.Check balance \n 4.withdraw ammout\n 5.Transcation details \n 6.Edit customer \n 7.delete customer \n 8.exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: 
                user.addCustmer();
                main.bankObj.map.put(user.account.accountNo, user);
                break;
                case 2:
                System.out.println("enter account number");
                long accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    Atm atm = new Atm();
                    main.bankObj.map.put(accountNo, atm.deposite(main.bankObj.map.get(accountNo)));
                }
                break;
                case 3:
                System.out.println("enter account number");
                long accountNo1 = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo1)){
                    Atm atm = new Atm();
                    atm.checkBal(main.bankObj.map.get(accountNo1));
                }
                break;
                case 4:
                System.out.println("enter account number");
                long accountNo2 = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo2)){
                    Atm atm = new Atm();
                    main.bankObj.map.put(accountNo2, atm.withdraw(main.bankObj.map.get(accountNo2)));
                }
                break;
            }
        }
        
        
    }
}
