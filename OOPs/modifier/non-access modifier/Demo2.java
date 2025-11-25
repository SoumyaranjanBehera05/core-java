//it is applicable for class and method but not for variable
//if a class is a abstract we cant create object of that class

// abstract class Demo2{
//     Demo2 d = new Demo2();
// }

//if a method is absrtact we cant provide implementation to the method

// abstract class Demo2{
//     abstract void m1(){}
// }

//if a method is abstract then it is mandatory to declare the class as abstract

// abstract class Demo2{
//     abstract void m1();
// }


//abstract class can contain both abtract and normal method

// abstract class Demo2{
//     abstract void m1();
//      void m2(){}
// }


//abstract class can be inherited
// abstract class A{
//     public abstract void m1();
// }
// class Demo2 extends A{
//     public void m1(){
//         System.out.println("This is abstract class");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//         d.m1();
//     }
// }


//abstract class can inherit from any normal class
// class A{
//     public void m1(){
//         System.out.println("This is A class");
//     }
// }
// abstract class Demo extends A{
//     public void m1(){
//         System.out.println("This is abstract class");
//     }
// }
// public class Demo2{
//     public static void main(String args[]){
//         A a = new A();
//         a.m1();
//     }
// }




//how can we provide implementation to the abstract method?
//we can provide implementation to the abstract method by overridind it

// abstract class A{
//     public abstract void m1();
// }
// class Demo2 extends A{
//     public void m1(){
//         System.out.println("This is abstract class");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//         d.m1();
//     }
// }


//can we declare any abstract method as static?
//no , bcz static method cant be override ,hence it is impossible to provide implementation to the method

//we cant declare any final method as abstract
//final static can be used simultaneously

// abstract class Demo{
//     final static void m1(){
//         System.out.println("This is use both final and static");
//     }
// }
// class Demo2 extends Demo{
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//         d.m1();
//     }
// }