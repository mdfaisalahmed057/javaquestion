public class reverse {
    public static void main(String[] args) {

        // variables initialization
        int num = 1234, reverse = 0, rem;

        // loop to find reverse number
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10; // then this will take the value of the remaining number eg 123
        }
        

        // output
        System.out.println("Reversed Number: " + reverse);
    }
}