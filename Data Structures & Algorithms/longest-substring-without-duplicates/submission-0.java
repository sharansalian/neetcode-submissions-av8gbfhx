
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> hashSet = new HashSet<>();

        while (right < s.length()) {
            while (hashSet.contains(s.charAt(right))) {
                hashSet.remove(s.charAt(left));
                left += 1;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            hashSet.add(s.charAt(right));
            right += 1;
        }

        return maxLen;
    }
}
