class Solution {
    public int vowelStrings(String[] words, int left, int right) {
    /*int count=0;
	for(int i=left;i<=right;i++){
		if((words[i].startsWith("a") || words[i].startsWith("e")  || words[i].startsWith("i") || words[i].startsWith("o") || words[i].startsWith("u")) && ( words[i].endsWith("a") || words[i].endsWith("e") || words[i].endsWith("i") || words[i].endsWith("o") || words[i].endsWith("u")) ) {
			count++;
		}

	}
    return count;*/

    // Another way code-
    /*int count=0;
    String v="aeiouAEIOU";
	for(int i=left;i<=right;i++) {
		String s=words[i];
		if(v.contains(String.valueOf(s.charAt(0))) && v.contains(String.valueOf(s.charAt(s.length()-1))) ) {
			count++;
		}
	}
    return count;*/

    //2.
    Set<Character> vowels=Set.of('a','e','i','o','u');
    int count=0;
    for(int i=left;i<=right;i++){
        String w=words[i].toLowerCase();
        char first=w.charAt(0);
        char last=w.charAt(w.length()-1);
        if(vowels.contains(first) && vowels.contains(last)){
            count++;
        }
    }
    return count;
    }
}
