 
public class subsequence {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        name(p, up);

     }
    public static void name(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
             name(p+ch, up.substring(1));

         name(p, up.substring(1));
        
        
    }
    
}
