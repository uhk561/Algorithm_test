import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int[128];
        Arrays.fill(minPress, Integer.MAX_VALUE);

        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char c = keys.charAt(i);
                if (c < 128) {
                    minPress[c] = Math.min(minPress[c], i + 1); 
                }
            }
        }

        int[] answer = new int[targets.length];
        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int sum = 0;
            boolean possible = true;

            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                int cost = (c < 128) ? minPress[c] : Integer.MAX_VALUE;

                if (cost == Integer.MAX_VALUE) {
                    possible = false;
                    break;
                }
                sum += cost;
            }

            answer[t] = possible ? sum : -1;
        }

        return answer;
    }
}
