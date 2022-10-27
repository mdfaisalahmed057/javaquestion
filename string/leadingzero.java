public class leadingzero {
    public static void main(String[] args) {
        String s="110";
        System.out.println(lead(s));
        
    }
    public static boolean  lead(String s) {
        if(s.contains("01")){
            return false;
        }
        return true;
        
    }
}
