class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  
        Arrays.sort(s);  

        int i = 0, j = 0, satisfied = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // If the cookie satisfies the child
                satisfied++;
                i++;  // Move to the next child
            }
            j++;  // Move to the next cookie
        }
        return satisfied;
    }
}