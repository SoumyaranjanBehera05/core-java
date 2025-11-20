//Hierarchical Inheritance

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
class C extends A{
    void m2(){
        System.out.println("C class");
    }
}
public class Test3{
    public static void main(String args[]){
        C c = new C();
        c.m1();
        c.m2();
    }
}