/**      instance block/non-static block    
 * 
 * ->It is the block which is getting executed automatically at the time of object creation.
 */

// class Demo{
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     {
//         System.out.println("instance block");
//     }
//     public void m1(){
//         Demo t = new Demo();
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         d.m1();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     Demo d = new Demo();
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         System.out.println("main end");
//     }
// }




// class Demo{
//     Demo d2 = new Demo();
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     Demo d2 = null;
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     static Demo d = new Demo();
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     {
//         Demo d2 = new Demo();
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }




// class Demo{
//     {
//         System.out.println("instance block-1");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
//     {
//         System.out.println("instance block-2");
//     }
// }




//when there is a priority between instance block and constructor then
//priority goes to instance block.



// class Demo{
//     Demo(){
//         System.out.println("constructor");
//     }
//     {
//         System.out.println("instance block");
//     }
//     public static void main(String args[]){
//         System.out.println("main method start");
//         Demo d = new Demo();
//         System.out.println("main end");
//     }
// }



