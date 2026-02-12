class Solution {
    static List<String> list;
    public void parentheses(int open,int close,String str,int n){
        if(str.length()==2*n){
            list.add(str);
        }
        if(open<n) parentheses(open+1,close,str+"(",n);
        if(close<open) parentheses(open,close+1,str+")",n);
    }
    public List<String> generateParenthesis(int n) {
        list=new ArrayList<>();
        parentheses(0,0,"",n);
        return list;
    }
}