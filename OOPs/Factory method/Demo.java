/**     Factory method
 * it is the method which is called by its class name and it returns the object of that class.
 */

// class Demo{
//     public static void main(String args[]){
//         Runtime r1 = Runtime.getRuntime();
//         Runtime r2 = Runtime.getRuntime();
//         System.out.println(r1 == r2);
//     }
// }




//we can call the factory method multiple number of times but it will going to
//  return the same object every time.

//user-defined factory method
class Demo{
    static Demo d = new Demo();
    public static Demo getDemo(){
        return d;
    }
    public static void main(String args[]){
        Demo d1 = Demo.getDemo();
        Demo d2 = Demo.getDemo();
        System.out.println(d1 == d2);
        System.out.println(d1 == d);
        System.out.println(d2 == d);
    }
}