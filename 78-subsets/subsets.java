class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        subset(0,nums,new ArrayList<>(),res);
        return res;
        
    }
    public static void subset(int index,int[] nums,List<Integer> list,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subset(index+1,nums,list,res);
        list.remove(list.size()-1);
        subset(index+1,nums,list,res);
    }
}