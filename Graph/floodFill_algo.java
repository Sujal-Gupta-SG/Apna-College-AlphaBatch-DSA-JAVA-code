import java.util.*;

public class floodFill_algo {

    //O(m*n)
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark the current cell as visited
        vis[sr][sc] = true;

        // Change the color of the current cell
        image[sr][sc] = color;

        // Move to the left
        helper(image, sr, sc - 1, color, vis, orgCol);

        // Move to the right
        helper(image, sr, sc + 1, color, vis, orgCol);

        // Move up
        helper(image, sr - 1, sc, color, vis, orgCol);

        // Move down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }
    

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        boolean vis[][] = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;

    }
}
