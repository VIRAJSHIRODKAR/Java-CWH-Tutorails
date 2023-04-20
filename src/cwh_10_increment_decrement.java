public class cwh_10_increment_decrement {
    public static void main(String[] args) {
        // Quick quiz

        // 1
       /* int x = 5,y = 1,b = 1,a = 1,c = 1,v = 1,u = 1,d = 1;
        System.out.println((x-y) / 2);
        System.out.println(((b*b) - (4*a*c))/ (2*a));
        System.out.println((v*v)-(u*u));
        System.out.println(a*b-d); */


        // Increment and Decrement Operators

        /*int a = 5;
        System.out.println(a++  + " " + a); // This is an increment operator it increases the value of the variable a after using it so the next time we print the value of the variable a it is the increased value
        int b = 5;
        System.out.println(++b + " " + b); // This is also an increment operator but it increases the value of a first and then uses the variable a so there it will increase the value of a and print it and next time we print the value of a it will also be the increased value of a
        System.out.println(a-- + " " + a); // This is an decrement operator it uses the value of the variable and then decrements 1 from its value so the next time we print the value it will print 1 value less of the assigned value
        System.out.println(--b + " " + b); // This is an decrement operator it decrements the value of the variable b first, and then it uses the value of b so for the first time we will get the value of b decremented by 1 and from next onwards also it will be decremented by one*/

        // Quick quiz NO 1

        int a = 10;
        System.out.println(a++);
        System.out.println(++a);
        int b = 30;
        System.out.println(b--);
        System.out.println(--b);

        // Quick quiz no 2

        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

    }
}
