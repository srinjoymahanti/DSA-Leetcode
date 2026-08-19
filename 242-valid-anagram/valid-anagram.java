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

        // int m=s.length(),n=t.length();
        // if(m!=n) return false;
        // int[] freq=new int[26];
        // for(int i=0;i<m;i++){
        //     freq[s.charAt(i)-'a']++;
        //     freq[t.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(freq[i]!=0) return false;
        // }
        // return true;


        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> sMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(sMap.containsKey(key)){
                int freq=sMap.get(key);
                sMap.put(key,freq+1);
            }
            else sMap.put(key,1);
        }
        HashMap<Character,Integer> tMap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(tMap.containsKey(key)){
                int freq=tMap.get(key);
                tMap.put(key,freq+1);
            }
            else tMap.put(key,1);
        }
        for(char key:sMap.keySet()){
            if(!tMap.containsKey(key)) return false;
            int sVal=sMap.get(key);
            int tVal=tMap.get(key);
            if(sVal!=tVal) return false;
        }
        return true;
    }
}