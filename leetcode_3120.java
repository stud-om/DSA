class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        Map<Character,Integer[]> m=new HashMap<>();
        int n=word.length();
        for(int i=0;i<n;i++){
            Character c = Character.toLowerCase(word.charAt(i));
            if(m.get(c)==null){
                if(word.charAt(i)<=90 && word.charAt(i)>=65){
                    Integer[] arr=new Integer[2];
                    arr[1]=1;
                    m.put(c,arr);
                }
                else{
                    Integer[] arr=new Integer[2];
                    arr[0]=1;
                    m.put(c,arr);
                }
            }
            else{
                if(word.charAt(i)<=90 && word.charAt(i)>=65){
                    Integer[] arr=m.get(c);
                    arr[1]=1;
                    
                }
                else{
                    Integer[] arr=m.get(c);
                    arr[0]=1;
                    
                }
            }
        }
        for(Integer[] arr:m.values()){
            if(arr[0]==null || arr[1]==null){
                continue;
            }
            else{
                if(arr[0]==1 && arr[1]==1)
                    count++;
            }
        }
        return count;
    }
}
