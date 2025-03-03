import java.util.*;

/**
 * Given the root of a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * APPROACH : Use two queues/lists and the Breadth First Search Method
 * The node on the rightmost side of the current queue is the right side view node
 * 
 */

public class binaryTreeRightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideView = new ArrayList<>();
        List<TreeNode> currentLevelNodes = new ArrayList<>();

        if (root != null) {
            currentLevelNodes.add(root);
        }

        while (!currentLevelNodes.isEmpty()) {
            rightSideView.add(currentLevelNodes.get(currentLevelNodes.size() - 1).val);

            List<TreeNode> nextLevelNodes = new ArrayList<>();

            for (TreeNode node: currentLevelNodes) {
                if (node.left != null) {
                    nextLevelNodes.add(node.left);
                }
                if (node.right != null) {
                    nextLevelNodes.add(node.right);
                }
            }
            currentLevelNodes = nextLevelNodes;
        }
        return rightSideView;
    }

}
