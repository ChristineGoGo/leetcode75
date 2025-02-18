
import java.util.HashMap;
import java.util.Map;


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

        Map<Integer, int[]> columnStores = new HashMap<>();
        int n = grid[1].length;
        int[] current = new int[n];

        for (int i = 0; i < grid.length; i ++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
            columnStores.put(i, current);
        }
        System.out.println(columnStores);
        return 0;
     }

     public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));

     }

}
