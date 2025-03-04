/**
 * Given a root node reference of a BST and a key, delete the node with the given 
 * key in the BST. Return the root node reference (possibly updated) of the BST.
 * Basically, the deletion can be divided into two stages:
 * Search for a node to remove. If the node is found, delete the node.
 * 
 * 
 * APPROACH : Traverse the BST using DFS to find the node to delete
 * Because we have a Binary Search Tree, the nodes on the right will have a greater
 * value than the root node and the left will have a lesser value than the root node
 * if the value given is greater than the root node, we traverse the right
 * if it is lesser than the root node, we traverse the left
 * if it is equal, we decide whether to delete the node and replace it with a node in the
 * right or the left
 * if there is a node to the right, we use this to replace the deleted node
 * if there is no right node, we use this to replace the deleted node
 * once we replace the value, we need to traverse the rest of the tree to replace the other nodes
 */

public class deleteNodeInABST_450 {
    //for replacing the root node without a left node
    public int rightSuccessor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    // for replacing root node with a right node
    public int leftSuccessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null ) {return null;}
        if (root.val == key) {
            // figure out if the node is a leaf with no children
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                // if node has right children
                root.val = rightSuccessor(root);
                root.right = deleteNode(root.right, root.val);
            } else {
                //if node has left children
                root.val = leftSuccessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

}
