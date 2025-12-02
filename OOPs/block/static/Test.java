//Q- what is direct ride ?
//Ans - if we are trying to print any variable inside the static block then 
//      it is known as direct ride.

// class Test{
//     static int x = 10;
//     static{
//         System.out.println(x);
//     }
//     public static void main(String args[]){

//     }
// }




//Q- what is indirect ride?
//if we are trying to print any variable inside any method then it is known as indirect ride.
// class Test{
//     static int x = 10;
//     public static void m1(){
//         System.out.println(x);
//     }
//     public static void main(String args[]){
//         m1();
//     }
// }



/**What is RIWO (Read Indirectly write only )
 ->Whenever the variable are assigned with there default value then 
    that state is known as RIWO state.
 ->When the variable is in RIWO state then it is impossible to perform directly ,
     otherwise we will get compile time error , saying illigal forward reference.
*/


// class Test{
//     static{
//         System.out.println(x);
//     }
//     static int x = 10;
//     public static void main(String args[]){
//         System.out.println("main method");
//     }
// }




class Test{
    static{
        m1();
        System.out.println("static block");
    }
    public static void m1(){
        System.out.println(x);
    }
    static int x = 10;
    public static void main(String args[]){

    }

}