public class Test3{
    public static int m1(String s){
        System.out.println("m1 method 1");
        return 1;
    }
    public static void m1(Object o){
        System.out.println("m1 method 2");
        return;
    }
    // public static float m1(Test t){
    //     System.out.println("m1 method 2");
    //     return 2.3f;
    // }
    public static void main(String args[]){
        // Test t = new Test();
        m1("Soumya");
        m1(null);

    }
}