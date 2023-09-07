//459

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



