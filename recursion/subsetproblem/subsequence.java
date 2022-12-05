import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        System.out.println(array(p, up));
      }

      //using only recursion
    // public static void name(String p,String up) {
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch=up.charAt(0);
    //          name(p+ch, up.substring(1));

    //          name(p, up.substring(1));      
    // }

      //using only recursion and arraylist

    public static  ArrayList<String> array(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
          }
        char ch=up.charAt(0);
            ArrayList<String> left= array(p+ch, up.substring(1) );
           ArrayList<String> right= array(p, up.substring(1)); 
           left.addAll(right);
         return left;  
    } 
}
