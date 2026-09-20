class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int pos=s.charAt(i)-'a'+1;
            int rev=27-pos;
             ans+=rev*(i+1);
        }
        return ans;
    }
}