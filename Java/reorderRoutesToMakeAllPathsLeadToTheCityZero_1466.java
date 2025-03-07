
import java.util.*;
/**
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only one way to 
 * travel between two different cities (this network form a tree). Last year, 
 * The ministry of transport decided to orient the roads in one direction because they are too narrow.
 * Roads are represented by connections where connections[i] = [ai, bi] represents a road from city ai to city bi.
 * This year, there will be a big event in the capital (city 0), and many people want to travel to this city.
 * Your task consists of reorienting some roads such that each city can visit the city 0. 
 * Return the minimum number of edges changed.
 * It's guaranteed that each city can reach city 0 after reorder.
 */

public class reorderRoutesToMakeAllPathsLeadToTheCityZero_1466 {
    public static int minReorder(int n, int[][] connections) {
        List<List<Integer>> adjacents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacents.add(new ArrayList<>());
        }

        for (int i = 0; i < connections.length; i++) {
            adjacents.get(connections[i][0]).add(connections[i][1]);
            adjacents.get(connections[i][1]).add(-connections[i][0]);
        }
        System.out.println(adjacents);
        
        boolean[] visit = new boolean[n];
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visit[0] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int num: adjacents.get(Math.abs(current))) {
                if (!visit[Math.abs(num)]) {
                    queue.add(num);
                    visit[Math.abs(num)] = true;
                    if (num > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {0,1};
        int[] arr2 = {1,3};
        int[] arr3 = {2, 3};
        int[] arr4 = {4,0};
        int[] arr5 = {4, 5};
        int[][] connections = new int[][] {arr1, arr2, arr3, arr4, arr5};

        System.out.println(minReorder(6, connections));

    }

}
