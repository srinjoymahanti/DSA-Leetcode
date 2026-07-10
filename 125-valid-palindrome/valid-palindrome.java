class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] sChar=str.toCharArray();
        int n=sChar.length;
        char[] reverse=new char[n];
        for(int i=0;i<n;i++){
            reverse[i]=sChar[n-1-i];
        }
        return Arrays.equals(sChar,reverse);
    }
}