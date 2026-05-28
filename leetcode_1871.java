class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        int[] temp=new int[n];
        Arrays.fill(temp,0);
        // solve(0,s,minJump,maxJump,temp);
        // if(temp[n-1]==1)
        //     return true;
        // return false;
        int count=0;
        temp[0]=1;
        for(int j=1;j<=n-1;j++){
            if(j-minJump>=0){
                count+=temp[j-minJump];
            }

            if(j-maxJump-1>=0){
                count-=temp[j-maxJump-1];
            }

            if(count>0 && s.charAt(j)=='0'){
                temp[j]=1;
            }
        }
        return temp[n-1]>0;
        
    }

    // public int solve(int index,String s,int minJump,int maxJump,int[] temp){

    //     int n=s.length();
    //     if(index==n-1){
    //         return temp[index]=1;
    //     }
        
    //     if(temp[index]!=-1){
    //         return temp[index];
    //     }

    //     for(int j=index+minJump ; j<=Math.min(index+maxJump,n-1);j++){
    //         if(s.charAt(j)=='0'){
    //             if (solve(j, s, minJump, maxJump,temp)==1) {
    //                 return temp[index]=1;
    //             }
    //         }
    //     }
    //     return temp[index]=0;

    // }
}
