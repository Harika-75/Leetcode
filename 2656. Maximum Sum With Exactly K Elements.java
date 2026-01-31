class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        int max=nums[n-1];
        for(int i=0;i<k;i++){
            sum+=max;
            max++;
        }
    return sum;
    }
}