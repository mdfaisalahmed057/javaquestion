import java.util.HashMap;

public class climbingstairs {
    
    public static void main(String[] args) {
        int n=6;
        System.out.println(name(n));
    }
    public static int name(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        if(map.containsKey(n))

        return map.get(n);

        if(n==1)return 1;

        if(n==2)return 2;

        int value=name(n-1)+name(n-2);

         map.put(n,value);
        System.out.println("map"+map);
         return value;
        
    }
}
