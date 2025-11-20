//we can change the modifier of overriden method
class A{
    void m1(int i){
        System.out.println("m1 method 1");
    }
}
class B extends A{
    public void m1(int i){
        System.out.println("m1 method 2");
    }
}
public class Test3{
    public static void main(String args[]){
        B b = new B();
        b.m1(23);
    }
}