public class longestZigZagPathInABinaryTree_1372 {
    int path = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root,0, true);
        return path;
    }
    
    public void dfs(TreeNode node, int steps, boolean left) {
        if (node == null) return;
        path = Math.max(path, steps);
        if (left) {
            steps += 1;
            left = false;
            dfs(node.left, steps, left);
            dfs(node.right,1,true );
        } else {
            dfs(node.left, 1, false);
            dfs(node.right, steps + 1, true);
        }
    }

}
