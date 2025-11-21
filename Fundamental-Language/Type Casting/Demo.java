/*
    Type Casting
    1- What is type casting?
    2- Difference between up casting and down casting?
    3- Why is explicit casting required when converting double to int?
    4- What happens if we cast a higher data type into a lower one and the value is too large/
    

 */


//Conversion of one data type to another data type is called Type Casting
//There are two types of type casting
//1- Implicit Type Casting (Automatic Type Conversion)
//2- Explicit Type Casting (Manual Type Conversion)
public class Demo {
    public static void main(String[] args) {
        //Implicit Type Casting
        int a = 10;
        double b = a; //int to double (lower data type to higher data type)
        System.out.println("Value of b: " + b); //10.0

        //Explicit Type Casting
        double c = 9.78;
        int d = (int) c; //double to int (higher data type to lower data type)
        System.out.println("Value of d: " + d); //9

        //When we cast a higher data type into a lower one and the value is too large
        int e = 130;
        byte f = (byte) e; //int to byte
        System.out.println("Value of f: " + f); //-126 (Overflow occurs)
    }
}