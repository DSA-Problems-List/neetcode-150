class Solution{
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count character frequencies
        int[] charCount = new int[26];

        // increment counts for characters in s and decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false; // Mismatch in character counts
            }
        }

        return true; // All counts are zero, so they are anagrams
    }
}