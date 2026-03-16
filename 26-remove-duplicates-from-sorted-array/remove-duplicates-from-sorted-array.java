class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] newArr=new int[n];
        int k=0;
        newArr[k++]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                newArr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++)
        {
            nums[i]=newArr[i];
        }
    return k;
    }
}