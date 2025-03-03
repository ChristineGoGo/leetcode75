public class searchInABinaryTree_700 {
    /**
     * You are given the root of a binary search tree (BST) and an integer val.
     * Find the node in the BST that the node's value equals val and return the
     * subtree rooted with that node. If such a node does not exist, return null.
     *
     * APPROACH: Traverse through the Breadth First Search Iteration
     * Compare each node to the given value's node and return if they are equal
     * OR Use DFS to search using recursion
     * All the values to the right of a Binary Search Tree are greater than the root
     * All the values to the left of a binary search tree are less than the root
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) { return null;}
        if (root.val == val) { return root;}

        if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
