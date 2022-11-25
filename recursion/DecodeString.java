import java.util.*;
public class  DecodeString {
    public static void main(String[] args) {
        String s="3[e]3[t]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        Stack<Integer> counts=new Stack();
        Stack<String> result=new Stack();
        int indx=0;
        String res="";
        //checkig how many digits it contain
        while(indx<s.length()){
            if(Character.isDigit(s.charAt(indx))){
                int count =0;
            while(Character.isDigit(s.charAt(indx))){
                count=10*count+(s.charAt(indx)-'0');
                indx++;
            }
                counts.push(count);
            }else if(s.charAt(indx)=='['){
                result.push(res); 
                 res="";
                
                indx+=1;
            }else if(s.charAt(indx)==']'){
                StringBuilder temp=new StringBuilder(result.pop());
                int count=counts.pop();
                for(int i=0;i<count;i++){
                    temp.append(res);
                    System.out.println(temp);
                    
                }
                res=temp.toString();
                indx+=1;
                
            }else{
                res+=s.charAt(indx);
                indx++;
            }
            
        }
        return res;
    }
}

//revsit