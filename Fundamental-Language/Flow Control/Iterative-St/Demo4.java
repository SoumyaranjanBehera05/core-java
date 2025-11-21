class Demo4{
    public static void main(String args[]){
        //do-while loop

        // do{
        //     System.out.println(" number");
        // }while(false);


        // int i = 1;
        // do{
        //     System.out.println(" number"+(++i));
        // }while(true);



        //Prime number
        int i = 1,x = 5 , count = 0;
        do{
            if(x%i == 0){
                count++;
            }
            i++;
        }while(i <= x);
        if(count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("not a Prime number");
        }


    }
}