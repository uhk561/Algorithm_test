import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : delete_list) {
            set.add(num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}