import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Min-heap
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        // Count frequency of each element
        // Worst Case - n distinct elements are stored, so, space O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Push in min-heap and maintain size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            minHeap.offer(new int[]{frequency, num});

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Pick all top K elements
        int[] result = new int[k];
        int index = k - 1;
        while (!minHeap.isEmpty()) {
            result[index--] = minHeap.poll()[1];
        }
        return result;
    }
}
