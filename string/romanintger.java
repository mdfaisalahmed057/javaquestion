import java.util.*;
// public class romanintger {
//     public static void main(String[] args) {

//         String s = "III";
//         System.out.println(romanToInt(s));
//     }
//     // public  static int romanToInt(String s) {
//     //     HashMap<Character,Integer>map=new HashMap<>();
//     //     map.put('I',1);
//     //     map.put('V',5);
//     //     map.put('x',10);
//     //     map.put('L',50);
//     //     map.put('C',100);
//     //     map.put('D',500);
//     //     map.put('M',1000);
        
//     //   System.out.println(map);
//     //      return 0;
        
//     // }
//          public int romanToInt(String s) {
//             int len = s.length();
//             int ans = 0;
//             for (int i = 0; i < len; i++) {
//                 char ch = s.charAt(i);
//                 int cur = getValue(ch);
//                 if (i < len - 1 && cur < getValue(s.charAt(i + 1))) {
//                     ans -= cur;
//                 } else {
//                     ans += cur;
//                 }
//             }
    
//             return ans;
//         }
    
//         private int getValue(char ch) {
//             int ans = 0;
//             switch (ch) {
//                 case 'I':
//                     ans = 1;
//                     break;
    
//                 case 'V':
//                     ans = 5;
//                     break;
    
//                 case 'X':
//                     ans = 10;
//                     break;
    
//                 case 'L':
//                     ans = 50;
//                     break;
    
//                 case 'C':
//                     ans = 100;
//                     break;
    
//                 case 'D':
//                     ans = 500;
//                     break;
    
//                 case 'M':
//                     ans = 1000;
//                     break;
    
//                 default:
//                     break;
//             }
    
//             return ans;
//         }
    
    
// }
public class romanintger{
public static void main(String[] args) {
    String s="III";
    System.out.println(romanToInt(s));
    
}

public static int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int last = 1001, ans = 0;

    for(char ch : s.toCharArray()){
 
        int x = map.get(ch);
         if(last < x)
            ans += (x - last * 2);
        else
            ans += x;
        last = x;
    }
    return ans;
}
}