class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findcombination(0,target,candidates,ans,list);
        return ans;
    }
    public void findcombination(int ind,int target,int[]arr,List<List<Integer>> ans,List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            list.add(arr[i]);
            findcombination(i+1,target-arr[i],arr,ans,list);
            list.remove(list.size()-1);
        }
    }
}