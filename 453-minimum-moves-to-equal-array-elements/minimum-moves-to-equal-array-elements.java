class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
       int min=nums[0];
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
       }
       for(int j=0;j<nums.length;j++){
        sum+=nums[j]-min;
       }
        return sum;
    }
}