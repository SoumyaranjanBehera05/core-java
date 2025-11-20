//return type mean's output to the method
/*
    it is theree types 
    1-void
    2-static 
    3-non-static

 */


//How can we print the return type
//there are two ways to print the return type
// class Demo{
//     public static int m1(){
//         System.out.println("abc");
//         return 10;
//     }
//     public static void main(String args[]){
//         System.out.println(m1());//one way
//         int x = m1();//another way
//         System.out.println(x);
//     }
// }




// class Demo{
//     public static float m1(){
//         System.out.println("abc");
//         return 10.4f;
//     }
//     public static void main(String args[]){
//         float f = m1();
//         System.out.println(f);
//         System.out.println(m1());
//     }
// }



//WAP to print the return staement of a method which contain primitive type return type and non-primitive type argument
class Demo{
    public int m1(Demo d){
        System.out.println("abc");
        return 12;
    }
    public static void main(String args[]){
        Demo d = new Demo();
        int y = d.m1(null);
        System.out.println(y);
    }
}