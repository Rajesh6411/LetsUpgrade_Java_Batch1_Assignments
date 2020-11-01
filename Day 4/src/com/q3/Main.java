package com.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int temp=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the 5 Values: ");
        for (int i = 0 ; i<arr.length;i++){
            arr[i] = scanner.nextInt();
            temp +=arr[i];
        }
        System.out.println("Addition of 5 no is: "+temp);
    }
}
