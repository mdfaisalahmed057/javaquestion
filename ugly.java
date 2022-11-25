public class ugly {
    

    public static void main(String[] args) {
         int n=6;
        System.out.println(name(n));
    }
    public static boolean name(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2==0){
            return name(n/2);
        }
        if(n%3==0){
            return name(n/3);
        }
        if(n%5==0){
            return name(n/5);
        }         
        return false; 
    }
}
