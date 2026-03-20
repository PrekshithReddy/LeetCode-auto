class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
       int maxSum=nums[0];
       int currSum=nums[0];
       for(int i=1;i<n;i++)
       {
        int temp=currSum+nums[i];
        if(temp>nums[i])
        {
            currSum=currSum+nums[i];
        }
        else{
            currSum=nums[i];
        }
        if(currSum>maxSum)
        {
            maxSum=currSum;
        }
       }
    return maxSum;
    }


}