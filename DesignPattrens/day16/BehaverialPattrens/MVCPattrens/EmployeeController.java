package DesignPattrens.day16.BehaverialPattrens.MVCPattrens;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setEmName(name);
    }
    public void setEmployeeId(int id){
        model.setEmId(id);
    }

    public void setEmployeePlace(String place){
        model.setPlace(place);
    }


}
