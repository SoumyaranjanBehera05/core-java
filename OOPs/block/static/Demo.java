/**Static block
 * ->it is the block which is getting executed automatically before the main method
 * ->The static block will be executed at the time of class loading.
 */

// class Demo{
//     static{
//         System.out.println("static block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method");
//     }
// }


//within main method we can compile the program but we cant able to run it (after 1.5v onward)

// class Demo{
//     static{
//         System.out.println("static block");
//     }
// }



// class Demo{
//     static{
//         System.out.println("static block");
//     }
// }
//java filename.java



// class Demo{
//     static{
//         System.out.println("static block");
//         System.exit(0);
//     }
// }
//not recomended




//we can provide more than one static block inside a class ,
// but the flow of  execution of the static block will be form top to buttom.
// class Demo{
//     static{
//         System.out.println("static block 1"); 
//     }
//     public static void main(String args[]){
//         System.out.println("main method");
//     }
//     static{
//         System.out.println("static block 2");
//     }
// }




// class A{
//     static{
//         System.out.println("static block A");
//     }
// }
// class Demo extends A{
//     static{
//         System.out.println("static block B");
//     }
//     public static void main(String args[]){
//         System.out.println("main method");
//     }
// }





// class A{
//     static{
//         System.out.println("static block A");
//     }
// }
// class Demo{
//     static{
//         System.out.println("static block B");
//     }
//     public static void main(String args[]){
//         System.out.println("main method");
//     }
// }




// class Demo{
//     static{
//         System.out.println("static block 1");
//     }
//      public static void main(String args[]){
//         System.out.println("main method");
//     }
// }
// class A extends Demo {
//     static{
//         System.out.println("static block 2");
//     } 
// }





