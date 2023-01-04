 
public class Recursivesolutiontocount {
    public static void main(String[] args) {
        String s="abcab";
        String p=" ";
        name(s, p);

    }
    public static void name(String p,String up) {
if(up.isEmpty()){
    System.out.println(p);
    return;
}        
char ch=up.charAt(0);
name(p, up.substring(1));   //take it or ignore it   
name(p+ch, up.substring(1));

       }
}
