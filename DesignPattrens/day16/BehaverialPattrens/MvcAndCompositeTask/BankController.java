package DesignPattrens.day16.BehaverialPattrens.MvcAndCompositeTask;

public class BankController {
    private Bank model;
    private BankView view;

    public BankController(Bank model, BankView view) {
        this.model = model;
        this.view = view;
    }

    public void setBankName(String name){
        model.setBankName(name);
    }
    public void setBankAddress(String address){
        model.setBankAddress(address);
    }
    public void setBankCode(String code){
        model.setBankCode(code);
    }
    public String getBankName(){
        return model.getBankName();
    }


}
