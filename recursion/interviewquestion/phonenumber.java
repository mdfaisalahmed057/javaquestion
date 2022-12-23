public class phonenumber {
    public static void main(String[] args) {
        String p="";
        String up="12";
        // int target=4;
        pad(p, up);

     }
  static void pad(String p,String up) {
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    int digit=up.charAt(0)-'0';//(1-1)*3=0;i<3;i++;

     for(int i=(digit-1)*3;i<digit*3;i++){
        char ch=(char)('a'+i);//abc 
         pad(p+ch, up.substring(1));
    }
    
}

// second question 
static int dice(String p,int target) {
    int count=0;

    if(target==0){
            // System.out.println(count); 
        return count;
    }
 for(int i=1;i<=6 && i<=target;i++){
   count=count+ dice(p+i, target-i);

 }
 return count;        
    }
}

