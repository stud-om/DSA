class Solution {

    public static int lowerBound(ArrayList<Integer> arr, int target) {
        int left = 0, right = arr.size();

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
    
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer,ArrayList<Integer>>m=new HashMap<>();
        int s= queries.length;
        List<Integer> result= new ArrayList<>(s);
        int nl=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (!m.containsKey(nums[i])) {
                m.put(nums[i], new ArrayList<>());
            }
            m.get(nums[i]).add(i);
        }
        for(int q : queries){
            int res=Integer.MAX_VALUE;
            ArrayList<Integer> temp=m.get(nums[q]); 
            int size1=temp.size(); 
            if(temp.size()==1){
                result.add(-1);
                continue;
            }
            int pos=lowerBound(m.get(nums[q]),q);
            int right=temp.get((pos+1)%size1);
            int d=Math.abs(q-right);
            int circularDist=nl-d;
            res=Math.min(res,Math.min(d,circularDist));

            int left = temp.get((pos-1+size1)%size1);
            d=Math.abs(q-left);
            circularDist=nl-d;
            res=Math.min(res,Math.min(d,circularDist));
            result.add(res);

        }
        return result;

    }
}
