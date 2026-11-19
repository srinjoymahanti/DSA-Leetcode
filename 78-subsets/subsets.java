class Solution {
    private void helper(int i,List<List<Integer>> result,List<Integer> list,int[] arr){
        if(i==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        helper(i+1,result,list,arr);

        list.remove(list.size()-1);
        helper(i+1,result,list,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        helper(0,result,new ArrayList<>(),nums);
        return result;
    }
}