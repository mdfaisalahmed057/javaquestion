public class  jewelstone{
    public static void main(String[] args) {
        String je="aA";
        String sto="aAAbbbb";
        System.out.println(name(je, sto));
    }
   public static int name(String jew,String sto) {
    int count=0;

    for(int i=0;i<jew.length();i++){
        char c=jew.charAt(i);
        for(int j=0;j<sto.length();j++){
            char m=sto.charAt(j);
            if(c==m){
                count
                ++;
            }
         }
    }
   return count;

}
}