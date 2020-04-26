class Solution {
    public List<String> letterCombinations(String digits) {
       LinkedList<String> out_arr = new LinkedList();
       if(digits.length() == 0){
           return out_arr;
       }
       out_arr.add("");
       String[] char_map = new String[]{
           "0",
           "1",
           "abc",
           "def",
           "ghi",
           "jkl",
           "mno",
           "pqrs",
           "tuv",
           "wxyz"
       };
       for(int i = 0; i < digits.length(); i++){
           int index = Character.getNumericValue(digits.charAt(i));
           while(out_arr.peek().length() == i){
               String permulation = out_arr.remove();
               for(char c : char_map[index].toCharArray()){
                   out_arr.add(permulation+c);
               }
           }
       }
       return out_arr;
    }
}