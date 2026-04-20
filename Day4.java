// class Solution {
//     public int maxDistance(int[] colors) {
//         int n = colors.length;
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(colors[i]!=colors[j])
//                 ans=Math.max(ans,Math.abs(j-i));
//             }
//         }
//         return ans==Integer.MIN_VALUE?0:ans;
//     }
// }

class Solution {
    public int maxDistance(int[] A) {
        int n = A.length;
        int left = 0, right = 0;

        for (int i = 0; i < n; i++)
            if (A[i] != A[n - 1]) {
                left = i;
                break;
            }

        for (int i = n - 1; i >= 0; i--)
            if (A[i] != A[0]) {
                right = i;
                break;
            }

        return Math.max(n - 1 - left, right);
    }
}
