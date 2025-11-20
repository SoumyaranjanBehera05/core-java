//we can overload the main method

public class Test4{
    public static void main(String s){
        System.out.println("m1 method 1");
    }
    public static void main(String args[]){
        main("abc");
    }

}