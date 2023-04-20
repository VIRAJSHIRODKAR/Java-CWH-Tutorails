import java.util.Scanner;
public class cwh_11_Excersise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of Subject 3");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks of Subject 4");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks of Subject 5");
        int sub5 = sc.nextInt();

        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);
        int percentage = (sum / 5);
        System.out.println("Your percentage is " + percentage);







    }
}
