/** Copy Constructor
 * 
 *  ->  it is a special type of constructor ,that creates a new object
 *  by coping the values of an existing object.
 * 
 * ->   it takes the existing object as a parameter and it copies the values of
 *  all the variables like primitive as well as non-primitive type and after 
 *  it creates a new object with the same state as like the original.
 * 
 * ->The main advantages of copy constructor is if we we make any changes in the
 *    copied object, then the existing/original object doesn't affect and vice versa
 */

class Demo{
    int roll;
    String name;
    Demo(int roll1,String name1){
        this.roll = roll1;
        this.name = name1;
    }
    Demo(Demo d){
        this.roll = d.roll;
        this.name = d.name;
    }
    public static void main(String args[]){
        Demo d1 = new Demo(10,"abc");
        System.out.println(d1.roll+"    "+d1.name);
        Demo d2 = new Demo(d1);
        System.out.println(d2.roll+"    "+d2.name);
    }
}