class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder ans = new StringBuilder();
        int increment = 2 * (numRows - 1);
        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < s.length(); i += increment) {
                ans.append(s.charAt(i));//for normal vertical printing

                //for adding diagonal elements only
                if (0 < r && r < numRows - 1) {
                    int diagonal = i + increment - 2 * r;
                    if (diagonal < s.length()) {
                        ans.append(s.charAt(diagonal));
                    }
                }
            }
        }
        return ans.toString();
    }
}