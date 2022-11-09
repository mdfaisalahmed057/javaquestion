 
public class first {
    public static void main(String[] args) {
        name(1);
    }
    // public static void name1() {
    //     System.out.println("hello");  
    //     name2();
    // }
    // public static void name2() {
    //     System.out.println("hello");  
    //     name3();
    // }
    // public static void name3() {
    //     System.out.println("hello");  
    // }
    public static void name(int n) {
        if(n==5){
            System.out.println(5);

            return ;
        }
        System.out.println(n);
        name(n+1);
        
    }
    
}
