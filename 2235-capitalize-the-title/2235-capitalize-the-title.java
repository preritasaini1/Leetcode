class Solution {
    public String capitalizeTitle(String title) {
        String arr[]=title.split("\\s+");
        for(int i=0;i<arr.length;i++){
    	arr[i]=arr[i].toLowerCase();
    	if(arr[i].length()>2) {
    		for(int j=0;j<arr[i].length();j++) {
        		arr[i]=String.valueOf(Character.toUpperCase(arr[i].charAt(0)))+arr[i].substring(1,arr[i].length());
        	}
    	}
    }
    String res=String.join(" ", arr);
    return res;
    }
}