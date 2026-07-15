class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){//remove white space
         i++;
        }
        if(i==n) return 0;//if only white spaces

        int sign=1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){//check sign
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }

        int num=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(num>Integer.MAX_VALUE/10 ||(num==Integer.MAX_VALUE/10 && digit>7)){//overflow check
                if(sign==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return sign*num;
    }
}