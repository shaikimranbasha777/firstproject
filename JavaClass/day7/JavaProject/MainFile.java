package JavaClass.day7.JavaProject;

import java.util.Scanner;

public class MainFile {
    Bank bankObj = new Bank();

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MainFile main = new MainFile();
        Customer user = new Customer();
        while(true){
            System.out.println("1.Add customer\n 2.deposite ammount \n 3.Check balance \n 4.withdraw ammout\n 5.Transcation details \n 6.Edit customer \n 7.delete customer \n 8.Disapy Custumer Details\n 9.Search Cuutomer details\n 10.exit");
            int choice = sc.nextInt();
            long accountNo;
            switch(choice){
                case 1: 
                user.addCustmer();
                main.bankObj.map.put(user.account.accountNo, user);
                break;
                case 2:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    Atm atm = new Atm();
                    main.bankObj.map.put(accountNo, atm.deposite(main.bankObj.map.get(accountNo)));
                }
                break;
                case 3:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    Atm atm = new Atm();
                    main.bankObj.map.replace(accountNo, atm.checkBal(main.bankObj.map.get(accountNo)));
       
                }
                break;
                case 4:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    Atm atm = new Atm();
                    main.bankObj.map.replace(accountNo, atm.withdraw(main.bankObj.map.get(accountNo)));
                }
                break;
                case 5:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    main.bankObj.map.get(accountNo).account.transcationDetails();;
                }
                break;
                case 6:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    main.bankObj.map.get(accountNo).editAccount(user);
                }
                break;
                case 7:
                System.out.println("enter account number");
                accountNo = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo)){
                    main.bankObj.map.remove(accountNo);
                    System.out.println("Account Details Removed Sucessfully");
                }
                break;
                case 8:
                        user.displayCustomer(user);
                break;
                case 9:
                System.out.println("enter account number");
                long accountNo2 = sc.nextLong();
                if(main.bankObj.map.containsKey(accountNo2)){
                    main.bankObj.map.get(accountNo2).displayCustomer(user);
                }
                break;
                case 10:
                System.exit(1);
                break;
                default:
                System.out.println("Enter Vaild Choice");
            }
        }
        
        
    }
}
