class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create a HashSet to store seen numbers
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : nums) {
            // check if the number is already in the set
            if (seenNumbers.contains(num)) {
                return true;
            }
            // add the number to the set
            seenNumbers.add(num);
        }
        return false;
    }
}