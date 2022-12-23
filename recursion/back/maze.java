import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
//   System.out.println( path(" ", 3, 3));
boolean [][] maze=  {
    {true,true,true,},
    {true,false,true,},
    {true,true,true,},

};
  restrictions("", maze, 0, 0); 
    }

    public static int count(int r,int c) {
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1, c);
        int right=count(r,c-1);
        return left+right;
        
    }
    // to print the direction 
 
    static ArrayList<String>  path(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();

        if(r==1 && c==1){
              list.add(p);
              return list;
         }
       
        if(r>1){
         list.addAll( path(p+'v', r-1, c));  

        }
        if(c>1){
          list.addAll(path(p+'h', r, c-1));
        }
return list;
    }
    // diagonal 
    static ArrayList<String>  diag(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();

        if(r==1 && c==1){
              list.add(p);
              return list;
         }
         if(r>1 && c>1){
            list.addAll(path(p+'d', r-1, c-1));
         }
        if(r>1){
         list.addAll( path(p+'v', r-1, c));  

        }
        if(c>1){
          list.addAll(path(p+'h', r, c-1));
        }
return list;
    }

    //////////////    restrictions

    public static void restrictions(String p, boolean[][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            restrictions(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            restrictions(p + 'R', maze, r, c + 1);
        }
    }
 
}
