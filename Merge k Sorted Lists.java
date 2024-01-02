/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     
        // Create a min-heap to keep track of the minimum element from each list
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the first element from each list to the min-heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Dummy node to simplify the code when building the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Continue until the min-heap is not empty
        while (!minHeap.isEmpty()) {
            // Pop the minimum element from the heap
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;

            // Move to the next element in the same list
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;

    }
}
