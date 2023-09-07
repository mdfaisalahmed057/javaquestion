public class automorphic{
    public static void main(String[] args) {
        int num=25;
        isAutomorphic(num);
        System.out.println( isAutomorphic(num));
        
    }
    static boolean isAutomorphic(int num){
        int square=num*num;

        while(num>0){
            if(square%2!=num%10){
                return false;
            }
            square=square/10;
            num=num/10;
        }
        return true;
      

    }

}


// // public class AutomorphicNumberExample1  
// {   
// //user-defined static method that checks whether the number is automorphic or not   
// static boolean isAutomorphic(int num)   
// {   
// //determines the square of the specified number  
// int square = num * num;   
// //comparing the digits until the number becomes 0  
// while (num > 0)   
// {   
// //find the remainder (last digit) of the variable num and square and comparing them  
// if (num % 10 != square % 10)   
// //returns false if digits are not equal  
// return false;   
// //reduce num and square by dividing them by 10  
// num = num/10;   
// square = square/10;   
// }   
// return true;   
// }   
// //Driver code  
// public static void main(String args[])   
// {   
// //number to be check      
// //calling the method and prints the result accordingly  
// System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
// System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");   
// }   
// }  

// public class automorphic{
//     public static void main(String[] args) {
//         int a=25;
//         int ans=a*a;
//         int rem=ans%100;
//         if(rem==a){
//             System.out.println("number is automorphic");
//         }else{
//                         System.out.println(" not number is automorphic");

//         }
//      }
// }


