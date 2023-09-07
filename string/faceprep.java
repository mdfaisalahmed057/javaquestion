// public class faceprep {
//     public static void main(String[] args) {
//         String str="aeiou";
//         char  cha='z';
//         for(int i=0;i<str.length()-1;i++){
//             if(str.charAt(i)==cha){
//                 System.out.println("the character is vowel ");
//             } else{
//                 System.out.println("not a vowel");
//             }
//         }

//     }
// }

public class faceprep{
    public static void main(String[] args) {
        char checkGivenChar='z';
        if(checkVowel(checkGivenChar)){
            System.out.println("character is vowel");
        }else{
            System.out.println("character is consonent");
        }
    }
    static boolean checkVowel(char checkGivenChar){
        char[] allVowels={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char isvowel:allVowels){
            if(isvowel==checkGivenChar){
                return true;
            }
        }

        return false;
    }
}
