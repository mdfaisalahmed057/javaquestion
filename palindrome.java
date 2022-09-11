 public class palindrome {
    public static void main(String[] args) {
       int num=1232 ; int reverse=0;
    int temp=num;

    while (temp != 0) {
        int rem = temp % 10;// 1 remainder will get 
        reverse = reverse * 10 + rem;
        temp /= 10; // then this will take the value of the remaining number eg 123
    }


if(num==reverse){
    System.out.println(" palindrome"+reverse+num);
}else{
    System.out.println(" not a palindrome" +reverse+" "+num);

}
    }
}
