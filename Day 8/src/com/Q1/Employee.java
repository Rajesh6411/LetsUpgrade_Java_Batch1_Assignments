package com.Q1;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    float salary;
    String designation;
    Scanner scanner = new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter The name Of employee: ");
        name = scanner.nextLine();
        System.out.println("Enter the Age of Employee: ");
        age = scanner.nextInt();
        System.out.println("Enter The salary of Employee: ");
        salary = scanner.nextFloat();
        System.out.println("Enter the Designation: ");
        designation = scanner.next();
    }

    public void displayDetails(){
        System.out.println("Name of Employee: "+name);
        System.out.println("Age of Employee: "+age);
        System.out.println("Salary of Employee: "+salary);
        System.out.println("Designation of Employee: "+designation);
    }
}
