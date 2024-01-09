mport java.util.Arrays;

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int plat_needed = 1, result =1;
        int i=1 ,j=1;
        while(i<n && j<n){
            if(at[i]<= dt[j]){
                plat_needed ++;
                i++;
            }
            else if(at[i]>dt[j]){
                plat_needed--;
                j++;
            }
            if(plat_needed>result){
                result=plat_needed;
            }
        }
        return result;
    }
}
