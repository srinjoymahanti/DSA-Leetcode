class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result=new StringBuilder();
        while (l1 >= 0 || l2>= 0 || carry>0) {
            int val1 = 0;
            int val2 = 0;
            if(l1>=0) val1=num1.charAt(l1)-'0';
            if(l2>=0) val2=num2.charAt(l2)-'0';
            int val=val1+val2+carry;
            carry=val/10;
            result.append(val%10);
            if(l1>=0) l1--;
            if(l2>=0) l2--;
        }
        return result.reverse().toString();
    }
}