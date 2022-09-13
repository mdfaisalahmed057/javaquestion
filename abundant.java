import java.util.Scanner;

   public class abundant{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
      //  abundants(num,num2);
      int n=sc.nextInt();
      int m=sc.nextInt();

    for(int i=n;i<=m;i++){
        abundants(i);
    }
    }

    static void abundants(int num){
    int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
           sum=sum+i;
            }
        }
        if(sum>num){
            System.out.println(num);
        }
        else{
            // System.out.println("not a abundant"+sum);  
        }
            
        }
    }
    

    
     
     
 
 