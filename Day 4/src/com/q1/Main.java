package com.q1;

public class Main {

    public static void main(String[] args) {
	Avenger[] avengers = new Avenger[5];

	for (int i=0;i<5;i++){
	    avengers[i] = new Avenger();
	    avengers[i].getDetails();
        System.out.println("------------------------------");
    }
	for (int i=0;i<5;i++){
	    avengers[i].displayDetails();
        System.out.println("-----------------------------");
    }
    }
}
