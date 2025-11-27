/**
 * interface is the media btween user and device .
 * interface is similar to class but not same as class bcz of the flling functionality
 * i-interface can't be instanciated.
 * ii-multiple inheritance is possible
 * iii-to create an interface we have to use interface keyword
 */

// interface A{}
// class B extends A{}

// class A {}
// interface B extends A{}

// interface A{}
// interface B implements A{}


// interface A{}
// interface B extends A{}


// interface A{}
// interface B implements A{}


//interface A{}
// interface B {}
// class C implements A,B{}



// Interface Variable  //
//====================//

//The variable present inside an interface bydefault public,static and final.

//WAP to prove the interface variable is bydefault static.
// interface A{
//     int x = 10;
// }
// class Demo{
//     public static void main(String args[]){
//         System.out.println(A.x);
//     }
// }




// interface A{
//     int x = 10;
// }
// class Demo implements A{
//     public static void main(String args[]){
//         System.out.println(A.x);
//         System.out.println(Demo.x);
//         System.out.println(x);
//         Demo  t = new Demo();
//         System.out.println(t.x);
//         A a = new Demo();
//         System.out.println(Demo.x);

//     }
// }



// interface A{
//     int x = 10;
// }
// class Demo implements A{
//     int x = 20;
//     public static void main(String args[]){
//         int x = 30;
//         System.out.println(x);
//         System.out.println(A.x);
//         Demo d = new Demo();
//         System.out.println(d.x);
//     }
// }



//WAP interface variable are bydefault final
// interface A{
//     int x =10;
// }
// class Demo implements A{
//     public static void main(String args[]){
//         A.x = 20;
//         System.out.println(A.x);
//     }
// }



// interface A{
//     int x =10;
// }
// class Demo implements A{
//     public static void main(String args[]){
//         x = 20;
//         System.out.println(x);
//     }
// }



// interface A{
//     int x =10;
// }
// class Demo implements A{
    // int x = 20;
//     public static void main(String args[]){
//         x = 20;
//         System.out.println(x);
//     }
// }

//here x is non static we cant re-initialize directly



//Interface Method
//====================//
//The method present inside an interface are bydefault public and abstract

// interface A{
//     public void m1();
// }


//WAP to provide implementation to the abstract method of innterface
interface A{
    public abstract void m1();
}
class Demo implements A{
    public void m1(){
        System.out.println("implementaed method");
    }
    public static void main(String args[]){
        Demo t = new Demo();
        t.m1();
        A a = new Demo();
        a.m1();
    }
}