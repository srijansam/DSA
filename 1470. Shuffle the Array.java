class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i = 0; i < n; i++) concat(nums, i, n + i);
        for(int i = n-1; i >= 0; i--) {
            int[] xy = getXandY(nums, i);
            nums[i * 2] = xy[0];
            nums[i * 2 + 1] = xy[1];
        }
        return nums;
    }

    private void concat(int[] nums, int index1, int index2) {
        nums[index1] = nums[index1] | (nums[index2] << 10);
    }

    private int[] getXandY(int[] nums, int index) {
        int[] delimited = new int[2];
        int mask = (1 << 10) - 1;
        delimited[0] = nums[index] & mask;
        delimited[1] = (nums[index] & (~mask)) >> 10;
        return delimited;
    }
}
