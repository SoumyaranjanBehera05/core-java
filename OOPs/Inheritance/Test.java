//Single inheritance

class A{
    void m1(){
        System.out.println("A class");
    }
}
class B extends A{
    void m2(){
        System.out.println("B class");
    }
}
public class Test{
    public static void main(String args[]){
        A a = new A();
        a.m1();
        A a1 = new B();
        a1.m1();
        B b = new B();
        b.m1();

    }
}