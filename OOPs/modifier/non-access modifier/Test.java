/* method hiding

    changing the implementation part of any parent class static method 
    inside the child class , according to the child class requirement is the concept of 
    method hiding or compile time polymorphism or static method dispatch or static polymorphism or early binding

 */


class A{
    public static void m1(){
        System.out.println("static method 1");
    }
}
class B extends A{
    public static void m1(){
        System.out.println("static method 2");
    }
}
public class Test{
    public static void main(String args[]){
        A a = new A();
        a.m1();
        B b = new B();
        b.m1();
        A a1 = new B();
        a1.m1();
    }
}