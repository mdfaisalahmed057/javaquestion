public class reverse {
    public static void main(String[] args) {

        // variables initialization
        int num = 122131, reverse = 0, rem;
        int temp;
        temp=num;

        // loop to find reverse number
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10; // then this will take the value of the remaining number eg 123
        }
        // output
        if(num==reverse){
            System.out.println("palindrome Number: " + num);

        }else{
            System.out.println("not a plaindrome Number: " + num);

        }
    }
}