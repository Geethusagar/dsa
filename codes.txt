class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=1;
        if(s.length()==0 || s==null){
            return 0;
        }
        if(s.length()==1)
        {
            return 1;
        }
       HashSet <Character>  st = new HashSet();
       while(j<s.length()){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
               j++;
                max=Math.max(max,st.size());
            }
            else
            {
                st.remove(s.charAt(i));
                    i++;
                
            }
                
            
        
    }
        return max;
        
} 
}

    
