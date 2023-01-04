public class subseq {
    public static void main(String[] args) {
        // String p="";
        // String up="abcab";
        // name(p, up);
        char[] s1 = "faisal".toCharArray();
        char[] s2 = new char[s1.length];
        int index = 0;
        copy(s1, s2, index);
        System.out.println(String.valueOf(s2));
    }

    public static void name(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        name(p + ch, up.substring(1));// a,bc//ab//c//abc

        name(p, up.substring(1));// "" ,bc//""//c

    }

    public static void copy(char[] s1, char[] s2, int index) {

        s2[index] = s1[index];
        if (index == s1.length - 1) {
            return;
        }
        copy(s1, s2, index + 1);

    }

}
