//static method
/*we can call static method in 3 ways 
    1-Directly
    2-by Object
    3-by class name
*/

// class Demo2{
//     public static void m1(){
//         System.out.println("Static method");
//     }
//     public static void main(String args[]){
//         System.out.println("main method");
//         //directly
//         m1();
//         //by class name
//         Demo2.m1();
//         //by object
//         Demo2 d = new Demo2();
//         d.m1();
//     }
// }



//we can call static method inside any non-static area directly
// class Demo2{
//     public void m1(){
//         m2();
//         System.out.println("non-static method");
//     }
//     public void m2(){
//         System.out.println("static method");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//         d.m1();
//     }
// }