package JavaClass.day5;

public interface BankInterface {
    //public void addUser();

    public void checkLoan(long branchTotalFund, float branchIntrest );

    public float totalIntrest(float mainBankIntrest,float branchIntrest);

    public void displayUser();

}
