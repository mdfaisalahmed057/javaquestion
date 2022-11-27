public class traingle {
    public static void main(String[] args) {
        name(4, 5);
    }
    public static void name(int row,int col) {
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("e");
            name(row,col+1);
        }else{
            System.out.println();
            name(row-1, 0);
        }
        
    }
}
