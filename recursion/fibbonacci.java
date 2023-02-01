 
public class fibbonacci{
    public static void main(String[] args) {
        System.out.println(name(6));
        
    }
    public static int name(int n) {
        if(n<2){//4<2
            return n ;
        }else{
            return name(n-1)+name(n-2);

        }
        
    }
    
}