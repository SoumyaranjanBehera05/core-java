public class Test2{
    public static void m1(byte b){
        System.out.println("m1 method 1");
    }
    public static void m1(Short s){
        System.out.println("m1 method 2");
    }
    public static void main(String args[]){
        Test2 t = new Test2();
        t.m1((byte)12);
        t.m1((short)12);
    }

}