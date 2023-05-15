import java.util.Arrays;

public class rearrange {
public static void main(String[] args) {
    String str1="zkb";
    String str2="zbk";

    char[]arr1=str1.toCharArray();
    char[]arr2=str2.toCharArray();

  
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println(arr1);
    System.out.println(arr2);
    boolean res=Arrays.equals(arr1, arr2);
   
    if(!res){
        System.out.println( "no");
    }else{
        System.out.println( "yes");
    }


    
}
    
}
