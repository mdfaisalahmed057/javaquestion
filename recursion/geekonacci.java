
 
public class geekonacci {
	public static void main (String[] args) {
		//code
		   int A=1234;
           int B=2345;
           int C=678;
		    int N=8912;

		    System.out.println(geekOnacci(A, B, C, N));
		    
 		}
	
	
	public static int geekOnacci(int A, int B, int C, int N) {
	    
	    if(N == 1) {
	        return A;
	    }
	    
	    if(N == 2) {
	        return B;
	    }
	    
	    if(N == 3) {
	        return C;
	    }
	    
	    return geekOnacci(A, B, C, N - 1) + geekOnacci(A, B, C, N - 2) + geekOnacci(A, B, C, N - 3);
	}
}