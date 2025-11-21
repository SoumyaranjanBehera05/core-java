class Demo5{
    public static void main(String args[]){
        //switch case

        // int x= 35;
        // switch(x){
        //     case 10:
        //         System.out.println("case - 1");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        //case level switch must be constatnt
        // int x= 10;
        // switch(x){
        //     case x:
        //         System.out.println("case - 1");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        // final int x= 10;
        // switch(x){
        //     case x:
        //         System.out.println("case - 1");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        // int x = 10;
        // switch(x){
        //     case 'x':
        //         System.out.println("case - 1");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        // int x = 120;
        // switch(x){
        //     case 'x':
        //         System.out.println("case - 1");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        // local variable must be initialize
        // int x ;
        // switch(x){
        //     case 'x':
        //         System.out.println("case - 1");
        //     break;
        //     default : 
        //         System.out.println("default");
        // }


        //duplicate case level inside switch is an invalid java syntax

        // int a= 97;
        // switch(a){
        //     case 'a':
        //         System.out.println("case - 1");
        //     break;
        //     case 97:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        // }


        //The case level inside switch must be in the range of switch argument type
        // byte b = 10;
        // switch(b){
        //     case 10:
        //         System.out.println("case-1");
        //     break;
        //     case 100:
        //         System.out.println("case-2");
        //     break;
        //     case 200:
        //         System.out.println("case-3");
        //     break;
        //     default:
        //         System.out.println("default");
        // }


        //in switch the default case is optional
        // byte b = 100;
        // switch(b){
        //     case 100:
        //         System.out.println("case-1");
        // }


        //we can write default case anywhere inside switch
        // byte b= 101;
        // switch(b){
        //     case 10:
        //         System.out.println("case - 1");
        //     break;
        //     default:
        //         System.out.println("default");
        //     break;
        //     case 20:
        //         System.out.println("case - 2");
        //     break;
            
        // }


        //we cant print any independent statemnt inside switch
        // byte b = 10;
        // switch(b){
        //     System.out.println("abc");
        // }



        // byte b= 20;
        // switch(b){
        //     case 10:
        //         System.out.println("case - 1");
        //     break;
        //     default:
        //         System.out.println("default");
        //     case 127:
        //         System.out.println("case - 2");
        //     break;
        //     default:
        //         System.out.println("default");
            
        // }



        // byte b = 20;
        // switch(b)
        // {
        //     case 10:
        //         System.out.println("case-1");
        //     break;
        //     case 20:
        //         System.out.println("case-2");            
        //     case 127:
        //         System.out.println("case-3");
        //         break;
        //     default:
        //         System.out.println("default");            
        // }


        byte b = 20;
        switch(b)
        {
            case 10:
                System.out.println("case-1");
            case 20:
                System.out.println("case-2");            
            case 127:
                System.out.println("case-3");
            default:
                System.out.println("default");            
        }
        

    }
}