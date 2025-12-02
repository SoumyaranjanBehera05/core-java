/**  static control flow
 *  =====================
 * step-1 :- Identification of static data members from top to bottom and at the
 *           time of identification the static variable will be asigned with their default value.
 * 
 * step-2 :- The initialization of static variable as well as execution of static block 
 *           from top to bottom and at the time of initialization the static variable
 *           will asigned with there actual value.
 */


// class Demo2{
//     static int x = 10;
//     static{
//         m1();
//         System.out.println("static block-1");
//     }
//     public static void m1(){
//         System.out.println(y);
//     }
//     public static void main(String args[]){
//         System.out.println("main start");
//         m1();
//         System.out.println("main end");
//     }
//     static{
//         m2();
//         System.out.println("static block-2");
//     }
//     public static void m2(){
//         System.out.println(x);
//     }
//     static int y = 20;
// }




