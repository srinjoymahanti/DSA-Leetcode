class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    private void getPermute(int[] arr,int idx){
        if(idx==arr.length){
            List<Integer> list=new ArrayList<>();
            for(int ele:arr){
                list.add(ele);
            }
            ans.add(list);
        }
        for(int i=idx;i<arr.length;i++){
            swap(arr,i,idx);
            getPermute(arr,idx+1);
            swap(arr,i,idx);
        }
    }
    private void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        getPermute(nums,0);
        return ans;
    }
}