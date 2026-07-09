class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        int lb=n,low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                lb=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        int i=lb-1,j=lb;
        while(i>=0 && j<n && k>0){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di>dj){
                ans.add(arr[j]);
                j++;
            }
            else{
                ans.add(arr[i]);
                i--;
            }
            k--;
        }
        while(i<0 && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j>=n && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}