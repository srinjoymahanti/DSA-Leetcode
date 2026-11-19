class Solution {
    static List<String> list;
    private void generate(int open,int close,String str,int n){
        if(str.length()==2*n){
            list.add(str);
        }
        if(open<n) generate(open+1,close,str+"(",n);
        if(close<open) generate(open,close+1,str+")",n);
    }
    public List<String> generateParenthesis(int n) {
        list=new ArrayList<>();
        generate(0,0,"",n);
        return list;
    }
}