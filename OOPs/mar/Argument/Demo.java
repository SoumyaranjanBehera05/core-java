//Argument means input to the method
/*
    There are two types of argument
    1-Primitive
    2-non-Primitive

 */

//calling of a method with Primitive type argument
// class Demo{
//     public static void m1(int i){
//         System.out.println("primitive");
//     }
//     public static void main(String argss[]){
//         // m1();
//         m1(10);
//     }
// }



//upCasting and downCasting
// class Demo{
//     public void m1(int x){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         Demo d = new Demo();
//         //upcasting
//         d.m1('a');
//         d.m1((byte)10);
//         //downcasting
//         // d.m1(4.4);CE
//         d.m1((int)3.4);
//     }
// }



// class Demo{
//     public static void m1(float f){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         m1('a');
//     }
// }


// class Demo{
//     public static void m1(byte b){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         // m1(10);//CE
//         m1((byte)10);
//     }
// }



// class Demo{
//     public static void m1(Demo t){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         m1(new Demo());
//         m1(null);
//         // m1("abvg");//CE
//     }
// }



//WAP to call method which contains String type as an argument
// class Demo{
//     public static void m1(String s){
//         System.out.println("abc");
//     }
//     public static void main(String args[]){
//         m1(new String());
//         m1("abcgd");
//         m1(null);
//     }
// }



//WAP to call a method which contain both primitive and non-primitive as an argumnt
// class Demo{
//     public void m1(Demo d , float f){
//         System.out.println("It contains both primitive and non-primitive datad type "+f+" "+d);
//     }
//     public static void main(String argts[]){
//         Demo d = new Demo();
//         d.m1(null , 23.4f);
//     }
// }