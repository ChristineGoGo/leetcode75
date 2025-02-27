import java.util.LinkedList;
import java.util.List;
/*
 * Two Solutions!Given the root of a binary tree and an integer targetSum, 
 * return the number of paths where the sum of the values along the path equals targetSum.
 * The path does not need to start or end at the root or a leaf, but it must go downwards 
 * (i.e., traveling only from parent nodes to child nodes).
 */
public class pathSumIII_437 {
    int counter = 0;
    int target;
    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        dfs(root, new LinkedList<>());
        return counter;
        
    }

    public void dfs(TreeNode node, List<Integer> list) {
        if (node != null) {
            // add current node's value to the list
            list.add(node.val);
            //find the currentSum of all the numbers in the list
            int currentSum = 0;
            System.out.println(list);
            for (int i = list.size() - 1; i >= 0; i--) {     
                currentSum += list.get(i);
                System.out.println(currentSum);
                if (currentSum == target) {
                    System.out.println(currentSum);
                    counter++;
                }

            }
            // traverse the left side
            dfs(node.left, list);
            // traverse the right side
            dfs(node.right, list);
            
            //remove the last node from the list while backtracking
            list.remove(list.size() - 1);
        }
    }

}

// public class pathSumIII_437 {
// int counter = 0;
// int target;

// Map<Long, Integer> countMap = new HashMap<>();

// public int pathSum(TreeNode root, int targetSum) {
//     target = targetSum;

//     dfs(root, 0L);
//     return counter;
    
// }

// public void dfs(TreeNode node, long currentSum) {
//     if (node != null) {
//         // update the curent sum value
//         currentSum += node.val;
//         //update the counter
//         //---------path with target sum starts from the root
//         if (currentSum == target) {
//             counter += 1;
//         }
//         //--- path with target sum starts else where
//         counter += countMap.getOrDefault(currentSum - target, 0);

//         // update the hashmap
//         countMap.put(currentSum, countMap.getOrDefault(currentSum, 0) + 1);

//         // traverse the left side
//         dfs(node.left, currentSum);
//         // traverse the right side
//         dfs(node.right, currentSum);
        
//         //remove the last node from the map while backtracking
//         countMap.put(currentSum, countMap.get(currentSum) - 1);
//     } else {
//         return;
//     }
// }
