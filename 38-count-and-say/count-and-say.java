class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1)+"@";
        String ans="";
        int i=0,j;
        for(j=0;j<s.length();j++){
            if(s.charAt(i)!=s.charAt(j)){
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
}