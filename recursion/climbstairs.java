import java.util.*;
public class climbstairs {
    public static void main(String[] args) {
        int n=4;
        System.out.println(stairs(n));
    }
    public static int stairs(int n) {
        if(n==0){
         return 0;
        }
        if(n==1){
        return 1;
        }
        if(n==2){
        return 2;
         }

       int ln=  stairs(n-1)+stairs(n-2);//5//4
          return ln;
        
    }


public static int climbStairs(int n) {
    HashMap<Integer, Integer> map = new HashMap<>();

	if(map.containsKey(n)) return map.get(n);
	
	if(n == 1) return 1;
	if(n == 2) return 2;
	
	int value = climbStairs(n-1) + climbStairs(n-2);
	map.put(n, value);
	
	return value;
}
}