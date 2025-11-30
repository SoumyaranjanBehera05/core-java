/**Constructor Chaining
 * -> Calling of one constructor from another is the concept of constructor chaining.
 * -> it can be achived by the help of super() and this().
 * 
 * 
 * this():-
 *      it is used to call the current class constructor .
 * super():-
 *      it is used to call the parent class constructor
 */

/**Rules 
 * ->The call to this() must be the first statement inside any constructor.
 * ->The call to super() must be the first statement inside any constructor.
 * ->We cant use super() and this() simultaneously inside any construtor.
 * ->if we are not providing any constructor caller like call to super() and 
 *      call to this() inside any constructor then bydefault call to super will be 
 *      present at the first line inside that constructor.
*/


// class Demo2{
//     Demo2(){
//         System.out.println("Hi")
//         this();
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }



// class Demo{
//     Demo(){
//         System.out.println("1st constructor");
//     }
// }
// class Demo2 extends Demo{
//     Demo2(){
//         this();
//         super();
//     }
//     Demo2(int x){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }




// class Demo{
//     Demo(){
//         System.out.println("Demo");
//     }
// }
// class Demo2 extends Demo{
//     Demo2(){
//        System.out.println("Demo2");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }




// class Demo{
//     Demo(int x){
//         System.out.println("Demo");
//     }
// }
// class Demo2 extends Demo{
//     Demo2(){
//        System.out.println("Demo2");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }




//wap to proof a default constructor present inside construction.
// class Demo{
//     Demo(){
//         System.out.println("constructor 1");
//     }
// }
// class Demo2 extends Demo{
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }




// class Demo2{
//     Demo2(float f){
//         this('d');
//         System.out.println("constructor 1");
//     }
//     Demo2(char ch){
//         System.out.println("constructor 2");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2(12.3f);
//     }
// }



// class Demo2{
//     Demo2(float f){
//         this(1.2f);
//         System.out.println("constructor 1");
//     }
//     Demo2(char ch){
//         System.out.println("constructor 2");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2(12.3f);
//     }
// }



// class Demo2{
//     Demo2(float f){
//         this();
//         System.out.println("constructor 1");
//     }
//     Demo2(){
//         System.out.println("constructor 2");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2(12.3f);
//     }
// }



// class Demo{
//     Demo(int x){
//         System.out.println("Parent class");
//     }
// }
// class Demo2 extends Demo{
//     Demo2(){
//         super(12);
//         System.out.println("child class");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }



// class Demo2{
//     Demo2(){
//         this();
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }



//The constructor caller can be used only inside the constructor.
// class Demo2{
//     Demo2(){
//         System.out.println("constructor 1");
//     }
//     public static void main(String args[]){
//         Demo2 d = new Demo2();
//     }
// }