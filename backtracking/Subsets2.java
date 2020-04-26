class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> tempArr, int[] nums, int start){
        result.add(new ArrayList(tempArr));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempArr.add(nums[i]);
            backtrack(result, tempArr, nums, i+1);
            tempArr.remove(tempArr.size()-1);
        }
    }
}