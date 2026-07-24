class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        getPermute(0,nums);
        return ans;
    }
    public void getPermute(int idx,int[] arr){
        if(idx==arr.length){
            List<Integer> list=new ArrayList<>();
            for(int ele:arr){
                list.add(ele);
            }
            ans.add(list);
            return;
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,idx,i);
            getPermute(idx+1,arr);
            swap(arr,idx,i);
        }
    }
    public void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}