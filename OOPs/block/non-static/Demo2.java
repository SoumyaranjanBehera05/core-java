//instance control flow

class Demo2{
    int x = 10;
    Demo2(){
        System.out.println("constructor");
    }
    {
        m1();
        System.out.println("instance block-1");
    }
    public void m1(){
        System.out.println(y);
    }
    public static void main(String args[]){
        System.out.println("main method start");
        Demo2 d = new Demo2();
        d.m1();
        System.out.println("main end");
    }
    {
        m2();
        System.out.println("instance block-2");
    }
    public void m2(){
        System.out.println(x);
    }
    int y = 20;
}


