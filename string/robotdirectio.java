import java.util.*;
public class robotdirectio {
    public static void main(String[] args) {
        String moves="LDRRLRUULR";
System.out.println(judgeCircle(moves));
        
    }
    public static boolean judgeCircle(String moves) {
        HashMap<Character,Integer>map=new HashMap<>();
        char [] Characters=moves.toCharArray();
        for(int i=0;i<moves.length();i++){
             map.put(Characters[i], map.getOrDefault(Characters[i], 0) + 1);
         }
         System.out.println(map);
         if(map.get('R').intValue() == map.get('L').intValue()  && map.get('R').intValue() == map.get('L').intValue()) {
 return
  true;

      } 
        return false;
    }
}



// class Solution {
//     public boolean judgeCircle(String moves) {
//         int x = 0, y = 0;
//         for (char move: moves.toCharArray()) {
//             if (move == 'U') y--;
//             else if (move == 'D') y++;
//             else if (move == 'L') x--;
//             else if (move == 'R') x++;
//         }
//         return x == 0 && y == 0;
//     }
// }