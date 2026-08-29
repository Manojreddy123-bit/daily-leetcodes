import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        subsets(0,nums,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
    public void subsets(int index,int[] nums,List<Integer> list,Set<List<Integer>> set){
        if(index==nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subsets(index+1,nums,list,set);
        list.remove(list.size()-1);
        subsets(index+1,nums,list,set);

    }
}