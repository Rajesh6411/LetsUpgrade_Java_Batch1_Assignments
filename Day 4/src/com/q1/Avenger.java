package com.q1;

import java.util.Scanner;

public class Avenger {
    String name;
    int age;
    String power;
    String weapon;
    String planet;
    Scanner scanner = new Scanner(System.in);

    public void getDetails(){
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        System.out.print("Enter Power: ");
        power = scanner.next();
        System.out.print("Enter Weapon: ");
        weapon = scanner.next();
        System.out.print("Enter Planet: ");
        planet = scanner.next();
    }

    public void displayDetails(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Power is: "+power);
        System.out.println("Weapon is: "+weapon);
        System.out.println("Planet is: "+planet);
    }
}
