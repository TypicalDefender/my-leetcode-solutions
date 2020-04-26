class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        traverse(result, "", 0, 0, n);
        return result;
    }
    public void traverse(List<String> result, String curr, int open, int close, int max){
        //base case
        if(curr.length() == 2*max){
            result.add(curr);
            return;
        }
        if(open < max){
            traverse(result, curr+"(", open+1, close, max);
        }
        if(close < open){
            traverse(result, curr+")", open, close+1, max);
        }
    }
}