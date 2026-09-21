class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            if(set.contains(words[i])) continue;
            else{
                set.add(words[i]);
                for(int j=i+1;j<words.length;j++){
                    char char1=words[i].charAt(0);
                    char char2=words[i].charAt(1);
                    String word=""+char2+char1;
                    if(word.equals(words[j])){
                        count++;
                        set.add(words[j]);
                    }
                }
            }
        }
        return count;
    }
}