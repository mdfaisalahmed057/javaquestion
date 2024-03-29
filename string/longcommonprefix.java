import java.util.Arrays;

public class longcommonprefix {
    public static void main(String[] args) {
        String strs[]={"flower","flowr","floe"};
        System.out.println(longestCommonPrefix(strs));
        
       }
    //    public static String longestCommonPrefixe(String[] strs) {
    //     String prefix = strs[0];
    //     for(int index=1;index<strs.length;index++){
    //         while(strs[index].indexOf(prefix) != 0){
    //             prefix=prefix.substring(index,prefix.length()-1);
    //         }
    //     }
    //     return prefix;
    // }

       public static String longestCommonPrefix(String[] strs) {
        String r="";
        int n=strs.length;
          Arrays.sort(strs);//Sorted first
        System.out.println(Arrays.toString(strs));
        String s=strs[0];//smallest no of char
        String h=strs[n-1];//highest no of char
        for(int i =0;i<s.length();i++)//taken smallest length so that run time will be less
        {
             if(s.charAt(i)!=h.charAt(i))
             break;
            r=r+s.charAt(i);  
        }
        return r;  
    
       }
    }    
   

    // /*
    // PLEASE UPVOTE IF IT HELPS YOU! THANK YOU!
    // Recommend to dry run along with the example.
    
    // Working:
    // 1)Take the first(index=0) string in the array as prefix.
    // 2)Iterate from second(index=1) string till the end.
    // 3)Use the indexOf() function to check if the prefix is there in the strs[i] or not.
    // If the prefix is there the function returns 0 else -1.
    // 4)Use the substring function to chop the last letter from prefix each time the function return -1.
    
    // eg:
    // strs=["flower", "flow", "flight"]
    // prefix=flower
    // index=1
    //     while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flower")!=0)
    //     Since flower as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flowe"
    //     Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flowe")!=0)
    //     Since flowe as a whole is not in flow, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flow"
    //     Again while(strs[index].indexOf(prefix) != 0) means while("flow".indexOf("flow")!=0)
    //     Since flow as a whole is in flow, it returns 0 so now prefix=flow
    // index=2
    //     while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flow")!=0)
    //     Since flow as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "flo"
    //     Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("flo")!=0)
    //     Since flo as a whole is not in flight, it return -1 and  prefix=prefix.substring(0,prefix.length()-1) reduces prefix to "fl"
    //     Again while(strs[index].indexOf(prefix) != 0) means while("flight".indexOf("fl")!=0)
    //     Since fl as a whole is in flight, it returns 0 so now prefix=fl
    // index=3, for loop terminates and we return prefix which is equal to fl
    // */
