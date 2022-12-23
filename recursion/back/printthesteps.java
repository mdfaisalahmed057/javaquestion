import java.util.Arrays;

public class printthesteps {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true }

        };
        int[][] path = new int[maze.length ][maze[0].length ];
        stepspath("", maze, 0, 0, path, 1);
    }

    public static void stepspath(String p, boolean[][] maze, int r, int c, int path[][], int steps) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] i : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
            System.out.println(p);
            return ;
        }
       
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = steps;     
        if (c < maze[0].length - 1) {
            stepspath(p + 'R', maze, r, c + 1, path, steps + 1);
        }
        if (r < maze.length - 1) {
            stepspath(p + 'D', maze, r + 1, c, path, steps + 1);
        }
        if (r > 0) {
            stepspath(p + 'U', maze, r - 1, c, path, steps + 1);
        }
        if (c > 0) {
            stepspath(p + 'L', maze, r, c - 1, path, steps + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
