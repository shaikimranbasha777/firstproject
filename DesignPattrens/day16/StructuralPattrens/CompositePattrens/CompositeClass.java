package DesignPattrens.day16.StructuralPattrens.CompositePattrens;

import java.util.ArrayList;

public class CompositeClass {
    public static void main(String[] args) {
        Empolyees em1 = new Empolyees("imran", "developer", 25000, new ArrayList<>());
        Empolyees em2 = new Empolyees("malik", "software developer", 5000, new ArrayList<>());
        Empolyees junior1 = new Empolyees("mahaboob", "junior developer", 2000, new ArrayList<>());
    }
}
