class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for(char ch : s.toCharArray()){
            int length= stack.length();
            if(length>0 && stack.charAt(length-1)==ch){
                stack.deleteCharAt(length-1);
            }else{
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}