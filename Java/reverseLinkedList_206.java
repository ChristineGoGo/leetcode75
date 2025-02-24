public class reverseLinkedList_206 {
    /*
     * Given the head of a singly linked list, reverse the list, 
     * and return the reversed list.
     */

     public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
     }
}
