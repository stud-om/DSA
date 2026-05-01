





//brute force;
class Solution {

    // public int[] rotate(int[] nums,int number){


    //     int n=nums.length;
    //     for(int j=0;j<number;j++){
    //     int last=nums[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         nums[i+1]=nums[i];
    //     }
    //     nums[0]=last;
    //     }
    //     return nums;
    // }

// int ans=Integer.MIN_VALUE;
        // int n=nums.length;


        // for(int i=0;i<n;i++){
        //     int[] copy = nums.clone();

        //     int[] temp=rotate(copy,i);
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum=sum+j*temp[j];
        //     }
        //     ans=Math.max(sum,ans);
        // }
        // return ans;

    public int maxRotateFunction(int[] nums) {
        int F=0;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            F+=i*nums[i];
        }

        for(int k=0;k<=n-1;k++){
            int newF=F+sum-n*nums[n-1-k];
            ans=Math.max(ans,newF);
            F=newF;

        }
        return ans;
    }
}
