public class cwh_08_Operators {
    public static void main(String[] args) {
        // Operators in Java

//        Types of Operators

        // Arithmetic Operators

      /*  System.out.println("These are arithmetic operations");
        System.out.println("2+2 > "+(2+2));
        System.out.println("2*2 > "+(2*2));
        System.out.println("2/2 > "+(2/2));
        System.out.println("2-2 > "+(2-2));  */

        // Assignment Operators

        //System.out.println("These are assignment Operators and operations");
        int a;
        //System.out.println("a=1   Print a --> " + (a=1)); // this will assign the value 1 to the variable named ' a ' and when we print the variable a it will print the value of variable a i.e. 1


        // Comparison operators

        /*System.out.println("1===1 " + (1==1)); // this is a equality check operator it checks the equality of any two variables or numbers and compares if both are equal or not if both are equal then it will print the boolean value true if both are not equal then it will print the boolean value false
        System.out.println("1>=0 " + (1>=0)); // this is a greater than equal to operator it checks the first variable or number is greater than or equal to second number or variable, if any one of the two conditions are true then it will print true or else it will print false
        System.out.println("1<=3 " + (1<=3)); // this is a smaller than equal to operator it checks the first  variable or number if it is smaller than or equal to the second number or variable, if any one of the two conditions are true then it will print the boolean value true or else it will print the boolean value false */

        // Logical Operators

        /* System.out.println(true && false); // this is a logical AND operator it prints the value true if both the statements are true even if one of the statements or both the statements are false then it will print the boolean value false
        System.out.println(true || false); // this is a logical OR operator it prints the value true if one of the two statements are true or both are true but if both the statements are false then it will print the boolean value false
        System.out.println(!(false)); // this is a logical NOT operator it prints the value opposite to that of where it is assigned if the value of a variable or a number or anything is true then it will change it to false and if it is false then it will change it to true */

        // Bitwise Operators

        // ignore this operators as they are not very important and the are not usable in 99% of the cases or projects

//        Precedence of Operators

        // if in a program there are multiple arithmetic operators in one command then java will give more precedence to * and / than the + and -
        System.out.println(2+3*4); // in here according to the sequence of the given mathematical problem 2 + 3 should have been executed first then 5 * 4 should be executed which will give us the value 20 but java doesn't work according to the sequence it works according to the precedence in this case
                                    // the multiples 3 * 4 first and then adds 2 + 12 which gives 14 as the answer but if we want that the + i.e. the addition gets executed first so we can give it a higher precedence by putting it in a curly braces ' (   ) '










    }
}
