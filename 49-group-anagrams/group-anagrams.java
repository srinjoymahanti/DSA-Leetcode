class Solution {
    public boolean anagram(String s,String t){
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
        int[] freq=new int[26];
        for(int i=0;i<m;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int ele:freq){
            if(ele!=0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        int n=strs.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            List<String> list=new ArrayList<>();
            for(int j=i+1;j<n;j++){
                if(anagram(strs[i],strs[j])){
                    list.add(strs[j]);
                    visited[j]=true;
                }
            }
            list.add(strs[i]);
            visited[i]=true;
            ans.add(list);
        }
        return ans;
    }
}