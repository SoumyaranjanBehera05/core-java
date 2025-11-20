//method is the block of code or set of instruction ,
// which is used to write some business logic or application logic according to programer

//there are two types of method static and non-static

//non-static method

//there is only one way to call non-static method by using object

// class Demo{
//     public void m1(){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         Demo t = new Demo();
//         t.m1();
//     }
// }




//WAP to call a non-static method inside the non-static area
//we can call non-static method inside any non-static area directly

// class Demo{
//     public void m1(){
//         m2();
//         System.out.println("non-static method");
//     }
//     public void m2(){
//         System.out.println("non-static method 2 ");
//     }
//     public static void main(String args[]){
//         Demo dd = new Demo();
//         dd.m1();
//     }
// }