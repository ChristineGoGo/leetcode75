


public class Solution {
    /*
     * 
     * Given a 0-indexed n x n integer matrix grid, 
     * return the number of pairs (ri, cj) such that row ri and column cj are equal.
     * A row and column pair is considered equal if they
     *  contain the same elements in the same order (i.e., an equal array).
     * 
     */


     public static int equalPairs(int[][] grid) {
        // Approach : store the columns in a map loop through the rows
        // collecting the count of equal rows and columns

        int n = grid.length, count = 0;

        for (int r = 0; r < n; r++) {
            boolean match = true;
            for (int c = 0; c < n; c++) {
                for (int i = 0; i < n; i++) {
                    if (grid[r][i] != grid[i][c]) {
                        match = false;
                    }
                }
                count += match == true ? 1 : 0;
            }
        }
        return count;
     }

     public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));

     }

}
