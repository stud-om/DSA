class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        int[] dp=new int[n+1];

        for(int i=0;i<=n;i++){
            if(i<10){
            if(i==0 || i==1 || i==8){
                dp[i]=1;
            }
            else if(i==2 || i==5 || i==6 || i==9){
                dp[i]=2;
                count++;
            } 
            else{
                dp[i]=0;
            }

            }
            else{
                int x=i/10;
                int y=i%10;
                if(dp[x]==0 || dp[y]==0){
                    dp[i]=0;
                }
                else if(dp[x]==1 && dp[y]==1){
                    dp[i]=1;
                }
                else{
                    dp[i]=2;
                    count++;
                }
            }
        }
        return count;
    }
}
