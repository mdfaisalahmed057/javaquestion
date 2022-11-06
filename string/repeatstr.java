// repeated string 

public class repeatstr {
    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }
    public static int repeatedStringMatch(String A, String B) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {// adding the values of A
            sb.append(A);
             count++;
         }
        
        if(sb.toString().contains(B)) return count;
        if(sb.append(A).toString().contains(B)) return ++count;
        return -1;
    }
    
}

//copy