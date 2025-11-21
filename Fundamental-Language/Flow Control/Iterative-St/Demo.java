class Demo{
    public static void main(String args[]){
        //if we want to execute any perticular statement or code multiple number of times then we shoud go for iterative statement.


        //it is 3 types
        //i- for loop
        //ii- while loop
        //iii- do-while loop


        //i- for loop
        //if we know the excat no of iteration then we should go for for loop
        
        // for(int i = 0 ; i<= 5 ; i++){
        //     System.out.println("Hi");
        // }


        //wap to print the no's btn a given range
        // for(int i =10 ; i <= 20 ; i++){
        //     System.out.println(i);
        // }


        //wap to print reverse no
        //  for(int i =10 ; i >= 1 ; i--){
        //     System.out.println(i);
        // }


        //WAP to print even no btn 1 to 10
        // for(int i = 2 ; i<= 10 ; i = i+2){
        //     System.out.println(i);
        // }

        //wap to print odd no
        //  for(int i =1 ; i <= 10 ; i = i+2){
        //     System.out.println(i);
        // }


        //wap to print the no's in btn a given range which is divisible by 3
        //  for(int i =1 ; i <= 100 ; i++){
        //     if(i%3 == 0){
        //         System.out.println(i);
        //     }
        // }


        //wap to count the digits of a given no
        // int num = 154;
        // int count = 0;
        // for(num = 154 ; num>0 ;num = num/10){
        //     count++;
        // }
        // System.out.println(count);


        //wap to display the sum of each digit of a number
        // int count = 0;
        // for(int i = 123; i>0 ; i= i/10){
        //     count = count + i%10;
        // }
        // System.out.println(count);



        //WAP to display the product of each digit of a number
        // int prod = 1;
        // for(int i = 123; i>0 ; i= i/10){
        //     prod = prod * i%10;
        // }
        // System.out.println(prod);


        //wap to check weather the number is a spy number or not
        //spy- if the sum of each digit of a number is equal to the product of each digit of that number then it is known as spy number.
        // int num ;
        // int rem = 0;
        // int sum = 0;
        // int prod = 1;
        // for(num = 152 ; num>0 ; num = num/10){
        //     rem = num % 10;
        //     sum = rem + sum;
        //     prod = prod * rem;
        // }
        // if(sum == prod){
        //     System.out.println("Spy No");
        // }
        // else{
        //     System.out.println("Not a Spy No");
        // }



        //WAP to check weather the number is a neon no or not .
        //neon - it is a number where the sum of each digit of its  square is equal to the original number , then it is known as neon number.
        // int num = 9;
        // int sqr = num * num ;
        // int rem = 0;
        // int sum = 0;
        // for(int i = sqr ; i != 0 ; i = i/10)
        // {
        //     rem = i % 10;
        //     sum = sum + rem ;
        // }
        // if(sum == num){
        //     System.out.println("It is a neon no");
        // }
        // else{
        //     System.out.println("It is not a neon no");
        // }



        //reverse number
        // int rem = 0;
        // int rev = 0;
        // for(int i = 123 ; i > 0 ; i = i/10 ){
        //     rem = i%10;
        //     rev = (rev*10)+rem;
        // }
        // System.out.println(rev);


        //multiplication table
        // for(int i = 1 ; i <= 14 ; i++){
        //     for(int j = 1 ; j <= 10 ; j++){
        //         System.out.println(i + " * "+j + " = "+(i*j));
        //     }
        // }



        //Prime number
        // int n = 7;
        // int count = 0;
        // for(int i = 1 ;i <= n ; i++){
        //         if(n%i == 0){
        //             count++;
        //     }
        // }
        // if(count == 2){
        //         System.out.println(" It is a prime number");
        // }
        // else{
        //         System.out.println(" It is not a prime number");        
        // }



        // prime number btn given range
        // for(int i = 3; i <= 9 ;i++ ){
        //     int count = 0;
        //     for(int j = 1 ;j <= i ; j++){
        //         if(i%j == 0){
        //             count++;
        //         }
        //     }
        //     if(count == 2){
        //         System.out.println(i+" It is a prime number");
        //     }
        //     else{
        //         System.out.println(i+" It is not a prime number");
        //     }
        // }

    }
}