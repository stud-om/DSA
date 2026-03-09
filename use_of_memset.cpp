class Solution {
public:
    int M = 1e9+7;
    int t[201][201][2];
    int solve(int zeroleft,int oneleft,bool startwithone,int limit){
        
        if(zeroleft==0 && oneleft==0){
            return 1;
        }

        if(t[zeroleft][oneleft][startwithone]!=-1){
            return t[zeroleft][oneleft][startwithone];
        }

        int result=0;
        if(startwithone==false){
            for(int len=1;len<=min(zeroleft,limit);len++){
                result=(result+solve(zeroleft-len,oneleft,true,limit))%M;
            }
        }
        else{
            for(int len=1;len<=min(oneleft,limit);len++){
                result=(result+solve(zeroleft,oneleft-len,false,limit))%M;
            }
        }
        return t[zeroleft][oneleft][startwithone]=result;
    }
    int numberOfStableArrays(int zero, int one, int limit) {
        //to initialze dp with -1 only with one line...
        memset(t,-1,sizeof(t));
        int solvewithones=solve(zero,one,true,limit);
        int solvewithzero=solve(zero,one,false,limit);

        return (solvewithones+solvewithzero)%M;
    }
};
