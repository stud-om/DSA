class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=Integer.MIN_VALUE;
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j] && i<=j){
                ans=Math.max(ans,(j-i));
            }
            // if(i==j){
            //     j++;
            // }
            if(nums1[i]>nums2[j]){
                i++;
                continue;
            }
            if(i>j){
                j++;
                continue;
            }
            j++;

            



        }
        return ans==Integer.MIN_VALUE?0:ans;

    }
}
