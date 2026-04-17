class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        
        int n=nums.length;
        int ans=n+1;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(m.containsKey(x)){
                ans=Math.min(ans,i-m.get(x));
            }
            m.put(reverseNum(x),i);

        }
        return ans==n+1? -1:ans;
    }
    private int reverseNum(int x){
        int y=0;
        while(x>0){
            int temp=x%10;
            y=y*10+temp;
            x/=10;
        }
        return y;
    }
}
