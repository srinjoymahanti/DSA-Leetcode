class Solution {
    private void generate(List<String> list,int open,int close,String str,int n){
        if(str.length()==2*n){
            list.add(str);
        }
        if(open<n) generate(list,open+1,close,str+"(",n);
        if(close<open) generate(list,open,close+1,str+")",n);
    }
    public List<String> generateParenthesis(int n) {    
        List<String> list=new ArrayList<>();
        generate(list,0,0,"",n);
        return list;
    }
}