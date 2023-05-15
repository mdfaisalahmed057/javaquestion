public class  jewelstone{
    public static void main(String[] args) {
        String jew="aA";
        String sto="aAbbbb";
        System.out.println(name(jew, sto));
    }
   public static int name(String jew,String sto) {
    int count=0;

    for(int i=0;i<jew.length();i++){
        char c=jew.charAt(i);//a,A
        for(int j=0;j<sto.length();j++){
            char m=sto.charAt(j);//a,A
            if(c==m){
                count
                ++;
            }
         }
    }
   return count;

}
}