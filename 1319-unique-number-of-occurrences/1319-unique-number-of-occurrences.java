class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       /* HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int ele:map.values()){
            set.add(ele);
        }
        return set.size()==map.values().size(); */

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }
        return set.size() == map.values().size();
    }
}