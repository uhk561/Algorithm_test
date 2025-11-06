class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] trueNum = new boolean[10];
        for (int n : numbers) {
            trueNum[n] = true;
        }

        for (int i = 0; i <= 9; i++) {
            if (!trueNum[i]) answer += i;
        }
        return answer;
    }
}