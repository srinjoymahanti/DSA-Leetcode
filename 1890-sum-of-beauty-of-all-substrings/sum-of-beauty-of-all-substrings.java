class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                int minFreq=Integer.MAX_VALUE;
                int maxFreq=0;
                for(int ele:freq){
                    if(ele>0){
                        minFreq=Math.min(minFreq,ele);
                    maxFreq=Math.max(maxFreq,ele);
                    }
                }
                count+=(maxFreq-minFreq);
            }
        }
        return count;
    }
}