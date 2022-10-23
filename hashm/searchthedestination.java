import java.util.*;
public class searchthedestination {
    public static void main(String[] args) {

        // Scanner scn = new Scanner(System.in);
		// int noofpairs_src_des = scn.nextInt();
		// HashMap<String, String> map = new HashMap<>();
		// for (int i = 0; i < noofpairs_src_des; i++) {
		// 	String s1 = scn.next();
		// 	String s2 = scn.next();
        HashMap<String, String> map = new HashMap<>();
         
			map.put("chennai","bangalore");
            map.put("bombay","delhi");	
			map.put("goa","chennai");	
			map.put("delhi","goa");	
	
    
    HashMap<String,Boolean>res=new HashMap<>();
    for(String src:map.keySet()){
        String dest=map.get(src);
        res.put(dest,false);
        if(res.containsKey(src)==false){
            res.put(src,true);

        }
    }
    String src="";
    for(String pot:res.keySet()){
        Boolean val=res.get(pot);
        if(val==true){
            src=pot;
            break;
        }
    }
    while(true){
        if(map.containsKey(src)==true){
        System.out.println(src+"->");
        src=map.get(src);
     }else{
        System.out.println(src+".");
        break;
    }
    
}
    }
}

