class Solution {
    public boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String cur = s.charAt(i+1) + "" + s.charAt(i);
            if (s.contains(cur)) {
                return true;
            }
        }
        return false;
    }
}
