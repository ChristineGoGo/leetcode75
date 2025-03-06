import java.util.HashSet;
import java.util.Set;
/**
 * There are n cities. Some of them are connected, while some are not. 
 * If city a is connected directly with city b, and city b is connected 
 * directly with city c, then city a is connected indirectly with city c.
 * A province is a group of directly or indirectly connected cities and no other cities outside of the group.
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are 
 * directly connected, and isConnected[i][j] = 0 otherwise.Return the total number of provinces.
 * 
 * APPROACH : Use DFS to iterate throught each node, checking whether each node has been visited or not
 */

public class numberOfProvinces_547 {
    public void dfs(int node, int[][] isConnected, Set<Integer> visitedCities) {
        visitedCities.add(node);
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[node][i] == 1 && !(visitedCities.contains(i))) {
                dfs(i, isConnected, visitedCities);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visitedCities = new HashSet<>();
        int provinces = 0;
        int n = isConnected.length;

        for (int i = 0; i < n; i++) {
            if (!visitedCities.contains(i)) {
                provinces++;
                dfs(i, isConnected, visitedCities);
            }
        }
        return provinces;
    }
}
