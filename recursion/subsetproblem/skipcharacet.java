 
public class skipcharacet{
public static void main(String[] args) {
    String s="bccad";
    String se="";
    skip(se, s);

}   
public static void skip(String p,String up) {
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch=up.charAt(0);
    if(ch=='a'){//bcc/ad
        skip(p, up.substring(1));
    }else{
        skip(p+ch, up.substring(1));

    }
}                             
}
