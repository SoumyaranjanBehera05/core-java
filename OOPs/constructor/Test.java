/**
 * multiple inheritance is not possible bcz of constructor chaining.
 */
class Demo{
    Demo(){
        System.out.println("constructor 1");
    }
}
class Demo2 extends Demo{
    Demo2(){
        System.out.println("constructor 2");
    }
}
class Test extends Demo,Demo2{
    super();
    public static void main(String args[]){
        Test t = new Test();
    }
}