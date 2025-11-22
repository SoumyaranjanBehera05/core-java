//final

//we cant inherit final class
// final class A{}
// class Demo extends A{}


//if any variable is declared as final we cant re-initialize the variable
//  final int x = 10;
//  x = 20;


//if a method is final then we cant override that method
// class A{
//     public final void m1(){
//         System.out.println("method m1");
//     }
// }
// class Demo extends A{
//     public final void m1(){
//         System,out.println("method m1");
//     }
// }



//final class can inherit the properties of normal class
// class A{
//     public  void m1(){
//         System.out.println("method m1");
//     }
// }
// final class Demo extends A{
//     public static void main(String args[]){
//         A a = new A();
//         a.m1();
//     }
// }



//final class can contain both final and normal method
// final class Demo{
//     final void m1(){}
//     void m2(){}
// }