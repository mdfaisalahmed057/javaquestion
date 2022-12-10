 
public class skipcharacet{
public static void main(String[] args) {
String original="abc";
String nonoriginal="";
    // String original="bccaapplead";
     skip(original, nonoriginal); 
     

}   
public static void skip(String nonoriginal,String original) {// p=bccad // up=""
    if(original.isEmpty()){
        System.out.println(nonoriginal);
        return;
    }
    char ch=original.charAt(0);
    if(ch=='a'){//bcc/ad
        skip(nonoriginal, original.substring(1));//
    }else{
        skip(nonoriginal+ch, original.substring(1));
        

    }
} 
// new method without using another extra parameter
public static String skipnewmethod(String original) {// p=bccad // up=""
    if(original.isEmpty()){
         return " ";
    }
    char ch=original.charAt(0);
    if(ch=='a'){//bcc/ad
       return skipnewmethod( original.substring(1));//
    }else{
       return ch+skipnewmethod( original.substring(1));
    }
}    

public static String skipstring(String original) {// p=bccad // up=""
    if(original.isEmpty()){
         return " ";
    }
    if(original.startsWith("apple")){
        return skipstring( original.substring(5));//
    }else{
       return  original.charAt(0)+skipstring( original.substring(1));
    }
}    
}
