class Solution {

    public int sum(int temp){
        int ans=0;
        while(temp>0){
            int a=temp%10;
            ans+=a;
            temp/=10;
        }
        return ans;
    }

    public int minElement(int[] nums) {
        int n=nums.length;
        int a= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            a=Math.min(sum(nums[i]),a);
        }
        return a;
    }
}
