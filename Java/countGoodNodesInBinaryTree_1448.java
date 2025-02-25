public class countGoodNodesInBinaryTree_1448 {
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, root.val);
    }

    public int findGoodNodes(TreeNode node, int maxValue) {
        int goodNodesFound = 0;
        if (node != null) {
            if (node.val >= maxValue) {
                maxValue = node.val;
                goodNodesFound++;
            }
            goodNodesFound += findGoodNodes(node.left, maxValue);
            goodNodesFound += findGoodNodes(node.right, maxValue);
        }
       
        return goodNodesFound;
    }
}
