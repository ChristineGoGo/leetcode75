public class lowestCommonAncestorOfABinaryTree_236 {
    /**
     * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined 
     * between two nodes p and q as the lowest node in T that has both p and q as descendants
     *  (where we allow a node to be a descendant of itself).”
     * 
     * APPROACH
     * Traverse the tree in a depth first manner.
     * Return the root if the root is either p or q
     * The least common ancestor is the root for which both the subtrees are not equal to null
     * Also it can be node itself if it is either p or q.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left !=  null && right != null) return root;
        if (left != null) return left;
        return right;
    }
}
