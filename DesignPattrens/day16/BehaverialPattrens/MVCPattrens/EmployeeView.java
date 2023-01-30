package DesignPattrens.day16.BehaverialPattrens.MVCPattrens;

public class EmployeeView {
    public void ShowDetails(String name, int id, String place){
        System.out.println("Employee Id " + id);
        System.out.println("Employee name " + name);
        System.out.println("Employee place " + place);
    }
}
