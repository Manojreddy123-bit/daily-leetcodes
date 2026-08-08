class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findcombination(0,target,candidates,ans,list);
        return ans;
    }
    public void findcombination(int ind,int target,int[] arr,List<List<Integer>> ans,List<Integer> list){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            findcombination(ind,target-arr[ind],arr,ans,list);
            list.remove(list.size()-1);
        }
        findcombination(ind+1,target,arr,ans,list);
    }
}