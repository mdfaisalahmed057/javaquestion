import java.util.Arrays;

public class anangram {
    public static void main(String[] args) {
        String d = "faisal";
        System.out.println(d.chars());

        boolean isanagram = true;
        String a = "amb";
        String b = "baa";
        int al[] = new int[256];
        int bl[] = new int[256];
        for (char c : a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : b.toCharArray()) {
            int index = (int) c;
            bl[index]++;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != bl[i]) {
                isanagram = false;
                break;
            }
        }
        if (isanagram) {
            System.out.println("yes");
        } else {
            System.out.println("do");
        }
    }

}
