//The wrapping of data and function into a single unit is the concept of encapsulatio.

class Demo2{
    private int roll;//data hiding
    public void setRoll(int roll1){
        this.roll = roll1;
    }
    public int getRoll(){
        return roll;
    }
}
class Demo{
    public static void main(String args[]){
        Demo2 d = new Demo2();
        d.setRoll(10);
        System.out.println(d.getRoll());
        Demo2 d2 = new Demo2();
        d.setRoll(20);
        System.out.println(d.getRoll());
    }
}