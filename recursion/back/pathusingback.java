public class pathusingback {
    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
         };
back("", maze, 0, 0);
    }

    public static void back(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;

        }
        // this my block path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            back(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            back(p + 'R', maze, r, c + 1);
        }
        if (c>0) {
            back(p + 'L', maze, r, c-1 );
        }
        if (r>0) {
            back(p + 'U', maze, r-1, c );
        }               
        //this line is where the function will be over
        // so before the function gets removed also remove the chnages 
        //that were made by that function
        maze[r][c]=true;
    }
}
