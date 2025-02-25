import java.util.ArrayList;
import java.util.List;


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

