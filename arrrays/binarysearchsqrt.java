public class binarysearchsqrt {
    public static void main(String[] args) {
        int c=5;
        System.out.println(sqrt(c));
    }
    public static boolean sqrt( int num) {
        int l=0;
        int r=num/2;

          while(l<=r){
             if(l*l+r*r<num){
                l--;
            }else if(l*l+r*r>num){
                r++;
            }else{
              return true;
            }
          }
         return false;
        
    }
    
}
