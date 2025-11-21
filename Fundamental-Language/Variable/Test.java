//Non-static variable

// class Test{
//     int x = 3;
//     int y;
//     public static void main(String[] args){
//         Test t1 = new Test();
//         Test t2 = new Test();
//         System.out.println(t1.x);
//         System.out.println(t2.x);
//         t1.x = 10;
//         t2.x = 12;
//         System.out.println(t1.x);
//         System.out.println(t2.x);

//         System.out.println(t1.y);
//         System.out.println(t2.y);
        
//     }
// }


//Static variable
// class Test{
//     static int x = 12;
//     static int y;
//     public static void main(String[] args){

//         //call directly
//         System.out.println(x);

//         //call using class name
//         System.out.println(Test.x);

//         //call using object
//         // Test t1 = new Test();
//         // System.out.println(t1.x);

//         System.out.println(y);

//         Test t1 = new Test();
//         Test t2 = new Test();
//         t1.x = 20;
//         t2.x = 30;
//         System.out.println(t1.x);
//         System.out.println(t2.x);
//     }
// }



//local variable
// class Test{
//     public static void main(String args[]){
//         int x = 13;
//         System.out.println(x);

//         int y;
//     }
// }


//The static and the local variable name can be same inside a class ,if we are trying to access directly priority goes to local variable.
// class Test{
//     static int x = 10;
//     int y = 12;
//     public static void main(String[] args){
//         int x = 20;
//         System.out.println(x);
//         System.out.println(Test.x);

//         Test t1 = new Test();
//         System.out.println(t1.y);

//         //re-initialize the local variable
//         x = 23;
//         System.out.println(x);

//         //re-initialize instance variable
//         t1.y = 34;
//         System.out.println(t1.y);

//         //re-initialize static variable
//         Test.x = 3;
//         System.out.println(Test.x);
//     }
// }


//The non-static and local variable name can be same inside a class.
// class Test {
//     int x = 10;
//     public static void main(String[] args) {
//         Test t1 = new Test();
//         int x = 20;
//         System.out.println(x); // local variable
//         System.out.println(t1.x); // instance variable
//     }
// }


// class Test{
//     int x = 10;
//     public static void main(String[]args){
//         x = 30;//error
//         System.out.println(x);
//     }
// }


//we cant re-initialize any variable inside class area
// class Test{
//     static int x = 10;
//     x = 20;
//     public static void main(String args[]){
//         System.out.println(x);
//     }
// }

//re-initialize non static variable
// class Test{
//     int x = 10;
//     public static void main(String[]args){
//         Test t1 = new Test();
//         System.out.println(t1.x);
//         t1.x = 30;//re-initialize non-static variable
//         System.out.println(t1.x);
//     }
// }


//re-initialize  static and local variable
// class Test{
//     static int x = 10;
//     public static void main(String[]args){
//         int x = 20;
//         x = 30;//re-initialize local variable
//         System.out.println(x);
//         Test.x = 40;//re-initialize static variable
//         System.out.println(Test.x);

//     }
// }


//static variable and non static variable namr cant be same bcz both have common way of accessing that is by the help of object
// class Test{
//     static int x = 123;
//     int x = 12;
//     public static void main(String args[]){

//     }
// }


//How can we make a variable constant ?
//We can make a variable constant by declare it final it means no one can change the value of that variable
// class Test{
//     public static void main(String args[]){
//         final int x = 4;
//         x = 5;
//         System.out.println(x);
//     }
// }


// class Test{
//     public static void main(String[]args){

//         char ch = 'S';
//         int i = (int)ch;
//         System.out.println(i);
//         System.out.println((int)'a');
//     }
// }