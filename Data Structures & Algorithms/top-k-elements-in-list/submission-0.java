class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(result.containsKey(nums[i])) {
                result.put(nums[i], result.get(nums[i]) + 1);
            }
            else {
            result.put(nums[i],0);
            }
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : result.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
            arr.sort((a,b) -> b[0] - a[0]);
            int[] res = new int[k];
            for(int i = 0; i< k; i++){
                res[i] = arr.get(i)[1];
            }
            return res;
    }
}
