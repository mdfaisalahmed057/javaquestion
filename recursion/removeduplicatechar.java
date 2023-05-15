public class removeduplicatechar {
    public static void main(String[] args) {
        String s="feeke";
         System.out.println(name(s));
        
    }
    public static String name(String s) {
        if(s.length()<=1)
        return s;
        if(s.charAt(0)==s.charAt(1))
            return name(s.substring(1));//1
            else
            return s.charAt(0)+name(s.substring(1));//f+e
    }
    
}
