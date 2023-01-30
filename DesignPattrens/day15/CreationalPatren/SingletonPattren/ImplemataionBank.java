package DesignPattrens.day15.CreationalPatren.SingletonPattren;

//import java.util.Scanner;

public class ImplemataionBank {

    
    public static void main(String[] args) {
        SinletonBankClass obj = SinletonBankClass.getObject();

        obj.checkBankStatus();
    }
}
