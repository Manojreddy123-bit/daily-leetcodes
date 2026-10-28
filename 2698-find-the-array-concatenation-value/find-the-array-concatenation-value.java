class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            String s=""+nums[i]+nums[j];
            int num=Integer.parseInt(s);
            sum+=num;
            i++;
            j--;
        }
        if(i==j){
            sum+=nums[i];
        }
        return sum;
    }
}