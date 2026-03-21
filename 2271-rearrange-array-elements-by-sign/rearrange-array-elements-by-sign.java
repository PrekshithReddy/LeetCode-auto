class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] ans=new int[nums.length];
       int positiveindex=0;
       int negativeindex=1;

       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<0)
        {
            ans[negativeindex]=nums[i];
            negativeindex+=2;
        }
        else{
            ans[positiveindex]=nums[i];
            positiveindex=positiveindex+2;
        }
       } 
       return ans;
    }
}