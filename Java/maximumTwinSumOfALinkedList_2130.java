public class maximumTwinSumOfALinkedList_2130 {
    public int pairSum(ListNode head) {
        //find the length of the node
        // add the values of the nodes and add them to an array

        ListNode current = head;
        int len = 0;
        int start = 0;
        int end;
        int i = 0;
        int maxTwinSum = 1;

        int[] nodeValues = new int[100000];

        while (current != null) {
            nodeValues[len] = current.val;
            current = current.next;
            len++;
        }

        // create an array called twinSum to store the twin sums
        // System.out.println(Arrays.toString(nodeValues));
        // System.out.println(len);

        int[] twinSums = new int[len / 2];
        end = len - 1;
        // System.out.println(end);
        // System.out.println(start);


        while (start < end) {
            int currentSum = nodeValues[start] + nodeValues[end];
            twinSums[i] = currentSum;
            start++;
            i++;
            end--;
        }

        // System.out.println(Arrays.toString(twinSums));
        for (int j = 0; j < twinSums.length; j++) {
            if (twinSums[j] > maxTwinSum) {
                maxTwinSum = twinSums[j];
            }
        }

        return maxTwinSum;
        

    }
}
