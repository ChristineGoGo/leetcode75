import java.util.LinkedList;
import java.util.List;

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
