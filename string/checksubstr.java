// //459

<<<<<<< HEAD
public class checksubstr {
    public static void main(String[] args) {
        String a = "bbbb";
        System.out.println(repeatedSubstringPattern(a));

    }

    public static boolean repeatedSubstringPattern(String str) {
        int l = str.length();//4
        for (int i = l / 2; i >= 1; i--) {//i=2
            if (l % i == 0) {
                int m = l / i;//2
                String subS = str.substring(0, i);//
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(subS);

                }
                System.out.println("this is the value of " + str);
                System.out.println("this is the value of " + sb);

                if (sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }

}



=======
// public class checksubstr {
//     public static void main(String[] args) {
//         String a=" bbbb";
//         System.out.println(repeatedSubstringPattern(a));
        
//     }
//     public static boolean repeatedSubstringPattern(String str) {
//         int l = str.length();
//         for(int i=l/2;i>=1;i--) {
//              if(l%i==0) {
//                 int m = l/i;
//                   String subS = str.substring(0,i);
//                  StringBuilder sb = new StringBuilder();
//                 for(int j=0;j<m;j++) {
//                     sb.append(subS);

//                 }
//                 if(sb.toString().equals(str)) return true;
//             }
//         }
//         return false;
//     }
    
// }

// public class checksubstr{
//     public static void main(String[] args) {
//         String s="abab";
//         String ans=s+s;
//         System.out.println(ans);
//         String ans3=ans.substring(1, ans.length()-1);
//         System.out.println("this is ans3"+"  "+ans3);

//         if(ans.substring(1, ans.length()-1).contains(s)){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//     }
// }
>>>>>>> 8e28f23980cde7795fe372443e6c3fc44bde0975
