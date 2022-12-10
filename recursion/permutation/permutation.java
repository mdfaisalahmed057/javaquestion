import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String p="";
        String up="abc";
        // name(p, up);

        // ArrayList<String>sol=list("", "abc");
        // System.out.println(sol);
      example(p, up);
    }


    public static void name(String p,String up) {

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
 
        char ch=up.charAt(0);//" "
 
        for(int i=0;i<=p.length();i++){//
            String f=p.substring(0, i);//(0,0);
             String s=p.substring(i, p.length());//0,
            name(f+ch+s, up.substring(1));
     
        }

    }
    public static int counts(String p,String up) {
        int count=0;

        if(up.isEmpty()){
             return 1;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
             String s=p.substring(i, p.length());
          count=count+counts(f+ch+s, up.substring(1));
         }
        return count;

    }
    public static ArrayList<String> list(String p,String up) {

        if(up.isEmpty()){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
             return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String>ls=new ArrayList<>();

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
             String s=p.substring(i, p.length());
              ls.addAll(list(f+ch+s, up.substring(1)));    
     
        }
return ls;

    }
    public static void example(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);//0,0
            String s=p.substring(i,p.length());//o,2
            example(f+ch+s,up.substring(1));
        }   
    }
}
