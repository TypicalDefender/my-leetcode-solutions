class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(candidates);
        back(result, new ArrayList(), candidates,target, 0);
        return result;
    }
    public void back(List<List<Integer>> result, List<Integer> temp, int[] nums, int target, int start){
        if(target < 0){
            return;
        }
        else if(target == 0){
            result.add(new ArrayList(temp));
        }
        else{
            for(int i = start; i < nums.length; i++){
                
                temp.add(nums[i]);
                back(result, temp, nums, target-nums[i], i);
                temp.remove(temp.size()-1);
            }
        }
    }
}
