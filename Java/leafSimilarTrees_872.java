import java.util.ArrayList;
import java.util.List;

/*

Consider all the leaves of a binary tree, from left to right order, the values of those
leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

                            3
                         /     \
                        /        \  
                      5           1
                     / \        /  \ 
                    /   \      /   \
                 6      2     9    8
                       /  \
                      /    \
                      7    4
Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.


*/


public class leafSimilarTrees_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaves = new ArrayList<>();
        List<Integer> root2Leaves = new ArrayList<>();

        dfs(root1, root1Leaves);
        dfs(root2, root2Leaves);
        return root1Leaves.equals(root2Leaves);   
    }
    public void dfs(TreeNode root, List<Integer> leaves) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                leaves.add(root.val);
            }
            dfs(root.left, leaves);
            dfs(root.right, leaves);
        }
    }
}

