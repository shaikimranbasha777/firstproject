package DesignPattrens.day15.CreationalPatren.SingletonPattren;

import java.util.Scanner;

public class SinletonBankClass{
    Scanner sc = new Scanner(System.in);

    private SinletonBankClass() {
    }

    private static SinletonBankClass singletonObject = new SinletonBankClass();

    public static SinletonBankClass getObject(){
        return singletonObject;
    }

    public void checkBankStatus(){
        System.out.println("Enter Bank time");
        
        int time = sc.nextInt();

        if (time > 9 && time < 18){
            System.out.println("Bank is Open");
        } else{
            System.out.println("Bank is closed");
        }
    }
    
}