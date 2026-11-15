class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> frequency_s = new HashMap<>();
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(frequency_s.containsKey(c)){
                frequency_s.put(c, frequency_s.get(c) + 1);
            }
            else {
                frequency_s.put(c, 1);
            }
        }
        for(int i = 0; i < t.length(); i ++){
            char c = t.charAt(i);
            if(frequency_s.containsKey(c)){
                frequency_s.put(c, frequency_s.get(c) - 1);
            }
            else {
                return false;
            }
        }
        for(Integer value: frequency_s.values() ){
            if(value != 0)
                return false;
        }
        return true;
    }
}
