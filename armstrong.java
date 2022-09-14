import java.util.Arrays;;
public class armstrong {
    public static void main(String[] args) {
        int num=371;
int n=num;
        int res=0;
        int rev=0;
         while(num>0){
            int rem=num%10;//3
          res=res+rem*rem*rem; 
           System.out.println(res);
             num=num/10;
        }
        if(n==res){
            System.out.println("armstrong"+" "+res);
        }else{
            System.out.println(" not a armstrong"+" "+res);


        }

     }
   
    

    
}
