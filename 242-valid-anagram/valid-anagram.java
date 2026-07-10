class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // char[] sString=s.toCharArray();
        // char[] tString=t.toCharArray();
        // Arrays.sort(sString);
        // Arrays.sort(tString);
        // for(int i=0;i<sString.length;i++){
        //     if(sString[i]!=tString[i]) return false;
        // }
        // return true;

        int m=s.length(),n=t.length();
        if(m!=n) return false;
        int[] freq=new int[26];
        for(int i=0;i<m;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}