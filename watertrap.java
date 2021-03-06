class Solution {
    public int trap(int[] v) {
        if (v==null || v.length==0)
            return 0;
            int ans=0,water =0,start=0,end=v.length-1,min=0;
            while(start<end){
                if(v[start]<v[end]){
                    min=start++;
                }
                else
                    min=end--;
                int lower=v[min];
            water=Math.max(water,lower);
            ans+=water-lower;
            }
            return ans;
            
        }
}
        
