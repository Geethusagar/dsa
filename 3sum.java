

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res = new ArrayList<List<Integer>>();
      if (nums == null || nums.length == 0) //if empty ,returns empty list
		return res;
         if(nums.length<3) 
             return res;
	Arrays.sort(nums);
	for (int i = 0; i < nums.length; i++) {
        if(nums[i]>0)
            break;
		if(i==0||(i>0)&&(nums[i]!=nums[i-1])){ // for elimination of dupliacates
		  
		int left = i + 1, right = nums.length - 1; 
		while (left < right) {
			
			if (nums[i] + nums[left] + nums[right] == 0) {  //checking if the sum of the elements is zero.
				res.add(Arrays.asList(nums[i], nums[left], nums[right]));
				while (left + 1 < right && nums[left] == nums[left+1])// Skip equal elements to avoid duplicates
					left++;
				while (right -1 > left && nums[right] == nums[right-1])// Skip equal elements to avoid duplicates
					right--;
				left++; 
				right--;
			} else if (nums[i] + nums[left] + nums[right] < 0) { 
				left++;
			} else {
				right--;
			}
		}
	}
    }
        
        return res;
    }
}