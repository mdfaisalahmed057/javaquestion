public class finalvalue{
    public static void main(String[] args) {
     String   operations[] = {"--X","X++","X++"};
     System.out.println(finalvalues(operations));
    }
    public static int finalvalues(String[] operations) {
        int x=0;

       for(String s:operations){
        if(s.charAt(0)=='-'){
            x--;
        }else{
            x++;
        }
        // System.out.println(s.charAt(1));

       }
 
        
        return x;
    }    
}