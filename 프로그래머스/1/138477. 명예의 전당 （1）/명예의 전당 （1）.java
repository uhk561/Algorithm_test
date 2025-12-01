import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> hall = new ArrayList<>();  
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            hall.add(score[i]);           
            Collections.sort(hall);  
            
            if (hall.size() > k) {
                hall.remove(0);           
            }
            
            answer[i] = hall.get(0);
        }

        return answer;
    }
}
