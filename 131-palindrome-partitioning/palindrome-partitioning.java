class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
        backtracking(list,0,s);
        return ans;
    }
    public void backtracking(List<String> list,int start,String s){
        if(start==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                list.add(s.substring(start,end+1));
                backtracking(list,end+1,s);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}