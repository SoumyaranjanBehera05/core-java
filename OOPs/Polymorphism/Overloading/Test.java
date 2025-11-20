public class Test{
    public void m1(int x){
        System.out.println("m1 method");
    }
    public void m1(float f){
        System.out.println("m2 method");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.m1(3);//exact match
        t.m1(2.3f);
        t.m1('a');//upcasting
        t.m1(23l);
        t.m1((int)10.2);
    }
}