import java.util.*;

class Solution {
    public int maxSubstrings(String word) {
        int n = word.length();
        List<int[]> validSubs = new ArrayList<>();

        for (int i = 0; i <= n - 4; i++) {
            for (int j = i + 3; j < n; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    validSubs.add(new int[]{i, j});
                    break; 
                }
            }
        }
        validSubs.sort((a, b) -> Integer.compare(a[1], b[1]));
        int count = 0, lastEnd = -1;
        for (int[] sub : validSubs) {
            if (sub[0] > lastEnd) {
                count++;
                lastEnd = sub[1];
            }
        }

        return count;
    }
}
