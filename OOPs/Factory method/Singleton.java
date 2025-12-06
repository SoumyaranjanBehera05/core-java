/**Singleton class
 * 
 * if we are allow to creare only one object of a class then,that class is know as Singleton class.
 */

class Singleton{
    static Singleton s = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
        return s;
    }
    public static void main(String args[]){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s1 == s2);
        System.out.println(s1 == s);
        System.out.println(s == s2);
    }
}