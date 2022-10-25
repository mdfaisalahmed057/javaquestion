 
public class firstquestion {
 public static void main(String[] args) {
    name(4);
 }  
 public static void name(int n) {
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }
        System.out.println();
    } 
 }
}
