class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n=nums.length;
        double Average=0;
       double windowSum=0;
       double maxSum=0;
       for(int i=0;i<k;i++)
       {
        windowSum=windowSum+nums[i];
       } 
       maxSum=windowSum;
       for(int i=k;i<n;i++)
       {
        windowSum=windowSum+nums[i];
        windowSum=windowSum-nums[i-k];
       maxSum=Math.max(maxSum,windowSum);
       } 
       Average=maxSum/k;
 return Average;
    }
    
}