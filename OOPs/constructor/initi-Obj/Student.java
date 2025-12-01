/**initialize  object
 * ->There are 4 ways in java to initialze the obj
 * 1-by directly
 * 2-by object reference 
 * 3-by constructor
 * 4-seter and geter method
  */

 //1-by directly
//  class Student{
//     int roll = 12;
//     public static void main(String args[]){
//         Student s1 = new Student();
//         System.out.println(s1.roll);
//         Student s2 = new Student();
//         System.out.println(s1.roll);
//     }
//  }



 //by object reference

//  class Student{
//     int roll;
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.roll = 14;
//         System.out.println(s1.roll);
//         Student s2 = new Student();
//         s1.roll = 15;
//         System.out.println(s1.roll);
//     }
//  }



//by construcotr


class Student{
    int roll;
    String name;
    Student(int roll1 , String name1){
        this.roll = roll1;
        this.name = name1;
    }
    public static void main(String args[]){
        Student s1 = new Student(12,"Aditya");
        System.out.println(s1.roll+"/   "+s1.name);
        Student s2 = new Student(1,"priyanka");
        System.out.println(s2.roll+"/   "+s2.name);
    }
 }