class Solution {
    public void moveZeroes(int[] nums) {
int[] newArr=new int[nums.length];
int index=0;
for(int i=0;i<nums.length;i++)
{
    if(nums[i]!=0)
    {
        newArr[index++]=nums[i];
    }
}
for(int i=0;i<nums.length;i++)
{
    nums[i]=newArr[i];
}
    }
}