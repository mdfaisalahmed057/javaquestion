 import java.util.HashSet;
import java.util.Iterator;
public class hashex {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set);
    //   if(!set.contains(1)){
    //     System.out.println("yes it contian");
    //   }else{
    //     System.out.println("not contain the values");
    //   }
    Iterator it=set. iterator();
    while(it.hasNext()){
        System.out.println(it.next());

    }
        
    

        
    }
    
    
}
