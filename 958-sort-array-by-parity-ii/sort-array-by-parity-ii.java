class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] SortedArr=new int[nums.length];
        int evenindex=0;
        int oddindex=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                SortedArr[evenindex]=nums[i];
                evenindex+=2;
            }
            else{
                SortedArr[oddindex]=nums[i];
                oddindex+=2;
            }
        
        }
return SortedArr;
        }

    }