class Solution {
    public int compress(char[] crr) {
        // String ans="";
        // int i=0,j=0;
        // while(j<crr.length){
        //     if(crr[i]==crr[j]) j++;
        //     else{
        //         ans+=crr[i];
        //         int len=j-i;
        //         if(len>1) ans+=len;
        //         i=j;
        //     }
        // }
        //     ans+=crr[i];
        //     int len=j-i;
        //     if(len>1) ans+=len;
        // for(i=0;i<ans.length();i++){
        //     crr[i]=ans.charAt(i);
        // }
        // return ans.length();

        String ans="";
        int i=0,j;
        int len;
        for(j=0;j<crr.length;j++){
            if(crr[i]!=crr[j]){
                ans+=crr[i];
                len=j-i;
                if(len>1) ans+=len;
                i=j;
            }
        }
        len=j-i;
        ans+=crr[i];
        if(len>1) ans+=len;
        for(i=0;i<ans.length();i++){
            crr[i]=ans.charAt(i);
        }
        return ans.length();
    }
}