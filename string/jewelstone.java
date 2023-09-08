public class  jewelstone{
    public static void main(String[] args) {
        String jew="aA";
        String sto="aAbbbb";
        System.out.println(name(jew, sto));
    }
   public static int name(String jew,String sto) {
    int count=0;

    for(int i=0;i<jew.length();i++){
<<<<<<< HEAD
         char c=jew.charAt(i);//a,A
=======
        char c=jew.charAt(i);//a,A
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
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