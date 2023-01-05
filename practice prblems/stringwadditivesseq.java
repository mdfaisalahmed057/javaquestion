public class stringwadditivesseq {
    public static void main(String[] args) {
        String str="abc de";
        System.out.println(totalconsonant(str, str.length()));
     }
    static boolean check(char ch ){
        ch=Character.toUpperCase(ch);
        return (ch=='A'|| ch=='E'||ch=='I'||ch=='O'|| ch=='U')==false && ch>=65 && ch<=90;
          

    }
    static int totalconsonant(String str,int n){
        if(n==1){
            if(check(str.charAt(0)))
                return 1;
                else
                return 0;
            
        }
        if(check(str.charAt(n-1)))
            return totalconsonant(str, n-1)+1;
            else
            return totalconsonant(str, n-1);
        
    }
}
