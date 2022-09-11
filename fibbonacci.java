public class fibbonacci {
    public static void main(String[] args) {
        int x = 6;
        int a = 0, b = 1;
        int i=2;
      while(i <=x) {
            int temp = b;
            b = b + a;
            a = temp;
            i++;

        }
        System.out.println(b);
    }

}
