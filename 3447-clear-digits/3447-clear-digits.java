class Solution {
    public String clearDigits(String s) {
    StringBuilder str=new StringBuilder(s);
	for(int i=1;i<str.length();i++) {
		if(Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(i-1))) {
			str.deleteCharAt(i);
			str.deleteCharAt(i-1);
			i=0;     //for rechecking the string
		}
	}
	String res=str.toString();
    return res;
    }
}