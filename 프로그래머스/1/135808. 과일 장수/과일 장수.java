import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;

        int len = score.length;

        for (int i = len - m; i >= 0; i -= m) {
            int low = score[i];
            answer += low * m;
        }

        return answer;
    }
}
