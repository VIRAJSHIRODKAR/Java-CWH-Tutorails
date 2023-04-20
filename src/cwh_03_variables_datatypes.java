public class cwh_03_variables_datatypes {
    public static void main(String[] args) {
        // a variable is a container is java to which we can assign any value of any data type
        // a data type is the type of value or data stored in the variable
        // the name of the variable should follow 5rules in Java

        // ----Rules for declaring the name of variable----
        //          1. it should not start with number
        //          2. it cannot contain spaces
        //          3. it is case sensitive so int viraj = 16; and int VIRAJ = 80; are two different variables
        //          4. it cannot contain a keyword which java does not want you to use to name any variable or function
        //          5. the name can contain a letter character number if the above four rules are followed

        int num1 = 16; //here int is the data type of the container named num1 which has the value 16 assigned to it
        int NUM1 = 30; //here int is the data type of the container named NUM1 which has the value 30 assigned to it
//        System.out.println(num1);
//        System.out.println(NUM1);

        // The data types are divided into two main categories
        //          1. Primitive datatype (Intrensic)
        //          2. Non-Primitive datatype (Derived)

        // The primitive data type consists of
        //          1. Byte which has the capacity to store upto 1byte(8bits) --it ranges form -128 to +127
        byte byte1 = 12;
//        System.out.println(byte1);
        //          2. Short which has the capacity to store upto 2byte(16bits) ---it is a bigger version of Byte
        short short1 = 130;
//        System.out.println(short1);
        //          3. Int (Integer) which has the capacity to store upto 4btye(32bits) ---it is a bigger version of Short so Byte<Short<Int
        int int1 = 99999;
//        System.out.println(int1);
        //
        //          4. Float which has the capacity to store upto 4byte(32bits) --it is used to store decimal number
        float float1 = 0.33f;
//        System.out.println(float1);
        //          5. Long which has the capacity to store upto 8byte(64buts) --it is the bigger version of float
//        long long1 = 0.33333;
//        System.out.println(long1);

        //          6. Double which has the capacity to store upto 8byte(64bits) --it is the bigger version of long it is the default data type for decimal numbers
        double double1 = 0.3333333;
//        System.out.println(double1);
        //
        //          7. Cha (Character) which has the capacity to store upto 2bytes (16bits) ---it is used to store single alphabet ex. 'a' , 'b' , 'z'

        char char1 = 'a';
//        System.out.println(char1);
        //
        //          8. Boolean which dosent have a capacity in bytes but it can store either true or false depending upon the condition

        boolean bool1 = true;
//        System.out.println(bool1);

        //Quick Quiz : Program to add three numbers

        int a = 3;
        int b =4;
        int c =6;
        int sum = a+b+c;
        System.out.println(sum);
    }
}
