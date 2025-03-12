class Solution {
    public String frequencySort(String s) {
    HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Sort characters based on frequency
        List<Character> charList = new ArrayList<>(freqMap.keySet());
        charList.sort((a, b) -> freqMap.get(b) - freqMap.get(a));  // Sort in descending order

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        for (char ch : charList) {
            result.append(String.valueOf(ch).repeat(freqMap.get(ch))); 
        }

        return result.toString();
    }
}