package JavaClass.day2;

import java.util.Scanner;

class MainBranch{
    String name;
    String id;
    long phno;
    private long bankTotalFund;
    private float bankIntrest;

    public MainBranch(long bankTotalFund, float bankIntrest) {

        this.bankTotalFund = bankTotalFund;
        this.bankIntrest = bankIntrest;
        //this.loan =loan;
    }

    public void checkloan(long loan, float branchIntrest ){
        if (loan < bankTotalFund){
            System.out.println("Loan Approved");
            totalIntrest(bankIntrest, branchIntrest);
        } 
        else{
            System.out.println("Loan Not Approved");
        }
    }
    
    public float totalIntrest(float bankIntrest, float branchIntrest){

        float totalIntrest = bankIntrest + branchIntrest;
        
        return (totalIntrest);
    }
}

class BranchBank extends MainBranch {
    String branchName;
    String branchId;
    long branchPhno;
    private float branchIntrest;
    

    public BranchBank(String name, String id, long phno, long bankTotalFund, float bankIntrest, String branchName,
            String branchId, long branchPhno, long branchTotalFund, float branchIntrest) {
        super(bankTotalFund, bankIntrest);
        super.name = name;
        super.id = id;
        super.phno = phno;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchPhno = branchPhno;
        this.branchIntrest = branchIntrest;
    }


    public static void main(String arg[]){
        //MainBranch bank1 = new MainBranch("Axis", "Axis1", 1234567891, 10000000, 5);
        BranchBank bank2 = new BranchBank("Axis", "Axis2", 1234567591, 1000000, 4, "Axis Bank", "Axis1", 123546897, 500000, 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Ammount");
        long loan = sc.nextInt();
        bank2.checkloan(loan, bank2.branchIntrest);
        //bank2.totalIntrest(bank2.branchIntrest);
    }
}
