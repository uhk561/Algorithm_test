class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num <= j; num++) {
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                temp /= 10;
                 if(digit == k) answer++;
            }
        }
        return answer;
    }
}