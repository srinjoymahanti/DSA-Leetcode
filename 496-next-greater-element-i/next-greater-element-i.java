class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[10001];
        // int[] arr=new [nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()) res[nums2[i]]=-1;
            else res[nums2[i]]=st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=res[nums1[i]];
        }
        return nums1;
    }
}