package DesignPattrens.day16.StructuralPattrens.CompositePattrens;

import java.util.List;

public class Empolyees {
    String name;
    String role;
    int salary;
    List<Empolyees> EmployList;

    public Empolyees(String name, String role, int salary, List<Empolyees> employList) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        EmployList = employList;
    }

    public void add(Empolyees em){
        EmployList.add(em);
    }
    public void remove(Empolyees em){
        EmployList.remove(em);
    }

    public List<Empolyees> getList(){
        return EmployList;
    }
}
