import java.util.ArrayList;
import java.util.List;

public class string {
    public static void main(String[] args) {
        String s="f";
        System.out.println(s.substring(0));
        // int r[]={1,2,23,};
        // for(int i=0;i<r.length-1;i++){
        //     List<List<Integer>> sil=withoutduplicates(r);
        // System.out.println(sil);
        // }

  
    }
    public static List<List<Integer>> withoutduplicates(int[] arr) {
        List<List<Integer>> lsa=new ArrayList<>();
        // lsa.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            List<Integer> lis=new ArrayList<>( );
             lis.add(i);
         }
 return lsa;        
    }
 
}
