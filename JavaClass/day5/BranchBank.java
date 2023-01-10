package JavaClass.day5;

import java.util.Scanner;

public class BranchBank extends MainBranch {
    String branchName;
    String branchId;
    long branchPhno;
    private long branchTotalFund;
    private float branchIntrest;

    static Scanner sc = new Scanner(System.in);
    

    public BranchBank(String mainBankName, String mianBankId, long mainBankPhno, long mainBankTotalFund, float mainBankIntrest, String branchName,
            String branchId, long branchPhno, long branchTotalFund, float branchIntrest) {
        super.mainBankIntrest = mainBankIntrest;
        super.mainBankTotalFund = mainBankTotalFund;
        super.mainBankName = mainBankName;
        super.mianBankId = mianBankId;
        super.mainBankPhno = mainBankPhno;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchIntrest = branchIntrest;
        this.branchTotalFund = branchTotalFund;
    }

    public static void main(String arg[]){
        //MainBranch bank1 = new MainBranch("Axis", "Axis1", 1234567891, 10000000, 5);
        BranchBank bank = new BranchBank("Axis", "Axis2", 1234567591, 10000, 4, "Axis Bank", "Axis1", 123546897, 5000, 2);

        System.out.println("Enter Number Of users");
        int noOfUsers = sc.nextInt();

        bank.approvedUsers = new MainBranch[noOfUsers];

        //System.out.println("Enter Name");
                    //user.userName = sc.next();
        //System.out.println("Please Enter Loan Ammount");
        //long loan = sc.nextInt();
        bank.checkLoan(bank.branchTotalFund, bank.branchIntrest);
        bank.displayUser();
        //bank2.totalIntrest(bank2.branchIntrest);
    }
}
