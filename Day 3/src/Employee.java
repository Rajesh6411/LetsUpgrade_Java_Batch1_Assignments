import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String name;
        int dateOfBirth, monthOfBirth, yearOfBirth;
        float monthlySalary, tax, salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Employee Date Of Birth: ");
        dateOfBirth = scanner.nextInt();

        System.out.println("Enter Employee Month Of Birth: ");
        monthOfBirth = scanner.nextInt();

        System.out.println("Enter Employee Year of Birth: ");
        yearOfBirth = scanner.nextInt();

        System.out.println("Enter Employee Monthly Salary: ");
        monthlySalary = scanner.nextFloat();

        salary = monthlySalary * 12;

        if (salary>=500000){
            
        }
    }
}
