import java.util.*;
/**
 * Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 * Return the smallest level x such that the sum of all the values of nodes at level x is maximal.
 * 
 * APPROACH : Perform a breadth first search for all the levels keeping track of the maximum sum found
 * and the level at which the maximum sum was
 */

public class maximumLevelSumOfABinaryTree_1161 {
    public int maxLevelSum(TreeNode root) {
        List<TreeNode> currentLevelNodes = new ArrayList<>();
        int currentLevel = 1;
        int maxSum = -100000;
        int maxLevel = 1;

        if (root != null) {
            currentLevelNodes.add(root);
        }

        while (!currentLevelNodes.isEmpty()) {
            List<TreeNode> nextLevelNodes = new ArrayList<>();
            int currentSum = 0;

            for (TreeNode node: currentLevelNodes) {
                if (node.left != null) {
                    nextLevelNodes.add(node.left);
                }

                if (node.right != null) {
                    nextLevelNodes.add(node.right);
                }
                currentSum += node.val;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLevel = currentLevel;
            }

            currentLevel++;
            currentLevelNodes = nextLevelNodes;
        }
        return maxLevel;
    }

}
