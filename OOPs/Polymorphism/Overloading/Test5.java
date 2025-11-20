public class Test5{
    public static void m1(int y ,int x...){
        System.out.println("m1 method 1");
    }
    public static void m1(int x){
        System.out.println("m1 method 2");
    }
    public static void main(String args[]){
        m1(23,34,55);
        m1(12,24);
        m1(11);
    }

}