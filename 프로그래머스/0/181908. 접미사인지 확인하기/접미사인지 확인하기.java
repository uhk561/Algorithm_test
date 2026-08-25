class Solution {
    public int solution(String my_string, String is_suffix) {
        
        if(is_suffix.length() > my_string.length()) {
            return 0;
        }
        
        int start = my_string.length() - is_suffix.length();
        
        for(int i = 0; i < is_suffix.length(); i++) {
            
            if(my_string.charAt(start + i) != is_suffix.charAt(i)) {
                return 0;
            }
        }
        
        return 1;
    }
}