public class phonenumber {
    public static void main(String[] args) {
        String p="";
        p.sub
        int target=4;
        dice(p, target);

     }
  static void pad(String p,String up) {
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    int digit=up.charAt(0)-'0';
    for(int i=(digit-1)*3;i<digit*3;i++){
        char ch=(char)('a'+i);
        pad(p+ch, up.substring(1));
    }
    
}
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
// public boolean repeatedSubstringPattern(String str) {
//     String s = str + str;
//     return s.substring(1, s.length() - 1).contains(str);
// }
public boolean repeatedSubstringPattern(String str) {
	int l = str.length();
	for(int i=l/2;i>=1;i--) {
		if(l%i==0) {
			int m = l/i;
			String subS = str.substring(0,i);
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<m;j++) {
				sb.append(subS);
			}
			if(sb.toString().equals(str)) return true;
		}
	}
	return false;
}