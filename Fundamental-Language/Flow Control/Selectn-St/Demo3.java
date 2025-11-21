class Demo3{
    public static void main(String args[]){
        //Nested if else

        int num = 20;
        if(num%3 == 0){
            if(num%5 == 0){
                 System.out.println(num + " divisible by 5 & 3");
            }
            else{
                 System.out.println(num + " not divisible by 5 divisible by 3");
            }
        }
        else{
            if(num%5 == 0){
                System.out.println(num + " divisible by 5 not 3");
            }
            else{
                System.out.println(num + " not divisible by 5 & 3");
            }
        }
    }
}