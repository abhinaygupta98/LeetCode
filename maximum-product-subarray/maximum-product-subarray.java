class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1, suffix=1;
        int ans =nums[0];
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix = prefix*nums[i];
            suffix = suffix* nums[nums.length-1-i];
            ans =Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
    }
}

//Explanation 
//https://www.youtube.com/watch?v=hnswaLJvr6g