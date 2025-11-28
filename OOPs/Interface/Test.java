/** Multiple inheritance
 * if more than one interface containing methods with same methods with 
 * same method signature , then in the implementation class we have to provide 
 * implementation at most once
 */


// interface A{
//     public abstract void m1();
// }
// interface B{
//     public abstract void m1();
// }
// class Test implements A,B{
//     public void m1(){
//         System.out.println("implemented method");
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1();
//     }
// }



//if more than one interface contain methods with different method signature ,
// then in the implemented class we have to implement separately.

// interface A{
//     public void m1(int x);
// }
// interface B{
//     public void m1(float f);
// }
// class Test implements A,B{
//     public void m1(int i){
//         System.out.println("This is m1 1st method");
//     }
//     public void m1(float d){
//         System.out.println("This is m1 2nd method");
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1(12);
//         t.m1(2.3f);
//     }
// }




//if more than one interface containing method with same method signature but 
// different non-primitive return type , then we can provide implementation by following 
// the rules of covarient concept


// interface A{
//     public abstract String m1(String s);
// }
// interface B{
//     public abstract Object m1(String o);
// }
// class Test implements A,B{
//     public String m1(String s){
//         System.out.println("abc");
//         return null;
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1("abc");
//     }
// }





// interface A{
//     public abstract String m1(String s);
// }
// interface B{
//     public abstract Object m1(String o);
// }
// class Test implements A,B{
//     public Object m1(String s){
//         System.out.println("abc");
//         return null;
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1("abc");
//     }
// }




// interface A{
//     public abstract A m1(String s);
// }
// interface B{
//     public abstract B m1(String o);
// }
// class Test implements A,B{
//     public Test m1(String s){
//         System.out.println("abc");
//         return null;
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1(null);
//     }
// }




// interface A{
//     public abstract A m1(String s);
// }
// interface B{
//     public abstract B m1(String o);
// }
// class Test implements A,B{
//     public A m1(String s){
//         System.out.println("abc");
//         return null;
//     }
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1(null);
//     }
// }



//in java 8 interface supports static ,default and private method.
// interface Test{
//     public static void m1(){
//         System.out.println("using public and static");
//     }
//     public static void main(String args[]){
//         Test.m1();
//         m1();
//     }
// }



//inside interface if we are trying to declare a default method then we have to use 
// the default modifier explicitly

// interface A{
//     default void m1(){
//         System.out.println("abc");
//     }
// }
// class Test implements A{
//     public static void main(String args[]){
//         Test t = new Test();
//         t.m1();
//     }
// }




//inside interface if we are trying to declare a private method,
// then we have to use static modifier

interface Test{
    private static void m1(){
        System.out.println("hi");
    }
    public static void main(String args[]){
        m1();
        Test.m1();
    }
}