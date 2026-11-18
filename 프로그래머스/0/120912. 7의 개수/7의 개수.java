class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            while (num > 0) {
                int digit = num % 10;

                if (digit == 7) answer++;

                num /= 10;
            }
        }

        return answer;
    }
}