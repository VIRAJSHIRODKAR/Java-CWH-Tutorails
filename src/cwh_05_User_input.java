import java.util.Scanner;

public class cwh_05_User_input {
    public static void main(String[] args) {
        // for reading data from the keyboard Scanner class is used which we have to import in the starting of the file and then assign a new scanner by naming it
        //Scanner sc = new Scanner(System.in); // this line creates a new scanner function named sc which can be used further to take input from the user
        //int input = sc.nextInt(); // this line will take the input and store it in the input variable the input should be in integer form only

        // lets say we have to make a program which takes the name of the user as the input and greets the user

        Scanner sc = new Scanner(System.in);
        System.out.print("May I know your name pls ? --> ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " nice to meet you, how would you like to proceed ?");



    }
}
