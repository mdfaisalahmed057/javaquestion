 
public class removechar {
    public static void main(String[] args) {
        String str1="welcome to";
        String str2="o";
        char ch=str2.charAt(0);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if(ch!=c){
                sb.append(c);
            }
         }
         System.out.println(sb);
    }
    
}
