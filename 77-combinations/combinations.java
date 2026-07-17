class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void getCombine(int n,int k,int idx,List<Integer> list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=n;i++){
            list.add(i);
            getCombine(n,k,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        getCombine(n,k,1,list);
        return ans;
    }
}