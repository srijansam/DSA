class Solution {
    public int getPairCount(int num) {
        return num * (num - 1) / 2;
    }
    public int numIdenticalPairs(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums)
            arr[num]++;
        int count = 0;
        for (int i = 1; i <= 100; ++i) {
            if (arr[i] > 1)
                count += getPairCount(arr[i]);
        }
        return count;
    }
}
