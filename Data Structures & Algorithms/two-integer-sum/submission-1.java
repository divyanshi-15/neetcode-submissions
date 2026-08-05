class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> indices = new HashMap<>();

      for(int i = 0; i < nums.length; i++){
        indices.put(nums[i],i);
      }

      for(int i = 0; i < nums.length; i++){
        int complement = target - nums[i];
        if(indices.containsKey(complement) && indices.get(complement)!= i){
          return new int[]{i,indices.get(complement)};
        }
      }
        return new int[0];
    }
}
