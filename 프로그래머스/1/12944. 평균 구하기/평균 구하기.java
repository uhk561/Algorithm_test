class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        int i = 0;
        for (int a : arr) {
            sum += a;
            i++;
        }
        double answer = (double)sum / i;
        return answer;
    }
}