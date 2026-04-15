class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        
        int last = num_list[len - 1];
        int prev = num_list[len - 2];
        
        int newValue;
        
        if (last > prev) {
            newValue = last - prev;
        } else {
            newValue = last * 2;
        }
        
        int[] result = new int[len + 1];
        
        for (int i = 0; i < len; i++) {
            result[i] = num_list[i];
        }
        
        result[len] = newValue;
        
        return result;
    }
}