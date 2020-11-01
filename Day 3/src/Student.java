import java.util.Scanner;

public class Student {
    static float marks = 500;
    public static void main(String[] args) {
        int a,b,c,d,e,add;
        //float percentage;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks for Following Subjects: ");
        System.out.println("Enter the Marks of English:");
        a = scanner.nextInt();

        System.out.println("Enter the Marks Of Hindi:");
        b = scanner.nextInt();

        System.out.println("Enter the Marks Of Mathematics:");
        c = scanner.nextInt();

        System.out.println("Enter the Marks of Social Science:");
        d = scanner.nextInt();

        System.out.println("Enter the Marks of Science:");
        e = scanner.nextInt();

        add =(a+b+c+d+e);
        System.out.println("You Obtained "+add+" Marks out of "+marks+".");

        float percentage = (add/marks)*100;

//        System.out.println("You got "+percentage+" %.");

        if(percentage>=75){
            System.out.println("You have "+percentage+" % with A Grade");
        }else if (percentage>=50 && percentage<=74){
            System.out.println("You have "+percentage+" % With B Grade");
        }else if (percentage>=35 && percentage<=49){
            System.out.println("You have "+percentage+" %with C Grade");
        }else {
            System.out.println("Sorry You are fail.");
        }

    }
}
