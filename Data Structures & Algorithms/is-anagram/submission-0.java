class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char c :s.toCharArray()){
            arr[c-'a']++;
        }
        int[] arr1 = new int[26];
        for(char c :t.toCharArray()){
            arr1[c-'a']++;
        }
        if(Arrays.equals(arr,arr1)){
            return true;
        }else{
            return false;
        }
    }
}
