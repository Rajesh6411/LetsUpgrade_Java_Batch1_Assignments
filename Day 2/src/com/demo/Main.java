package com.demo;

public class Main {

    public static void main(String[] args) {
	    Employee e = new Employee();
	    e.name = "Rajesh";
	    e.age = 25;
	    e.city = "Pune";

	    Employee e1 = new Employee();
	    e1.name = "Mangesh";
	    e1.age = 27;
	    e1.city = "Mumbai";

	    e.display();
	    e1.display();
    }
}
