public class TrappingRainwater {
    public static int trap (int[] height ){
        int n = height.length;
        int rightmax =0;
        int leftmax =0;
        int left =0 ;
        int right = n-1;
        int water =0;
        while(left<=right){
            if(height[left] <= height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }else{
                    water+= leftmax-height[left];
                }
                left++;
            }
            else {
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    water += rightmax - height[right];
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String[] Args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
