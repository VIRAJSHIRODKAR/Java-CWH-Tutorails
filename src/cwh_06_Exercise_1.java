import java.util.Scanner;

public class cwh_06_Exercise_1 {
    public static void main(String[] args) {
        // ---Exercise 1.1---> Program to calculate percentage of 5 subjects and input should be taken from the user

        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of Subject 1 --> ");
        int sub1 = input.nextInt();

        System.out.print("Enter the marks of Subject 2 --> ");
        int sub2 = input.nextInt();

        System.out.print("Enter the marks of Subject 3 --> ");
        int sub3 = input.nextInt();

        System.out.print("Enter the marks of Subject 4 --> ");
        int sub4 = input.nextInt();

        System.out.print("Enter the marks of Subject 5 --> ");
        int sub5 = input.nextInt();

        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        float percentage = (sum / 5f );

        System.out.print("Percentage -->" + percentage );
    }
}
