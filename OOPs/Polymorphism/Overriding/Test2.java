class A{
    public Object m1(int i){
        System.out.println("m1 method 1");
        return null;
    }
}
class B extends A{
    public String m1(int i){
        System.out.println("m1 method 2");
        return "ff";
    }
}
public class Test2{
    public static void main(String args[]){
        B b = new B();
        b.m1(23);
    }
}