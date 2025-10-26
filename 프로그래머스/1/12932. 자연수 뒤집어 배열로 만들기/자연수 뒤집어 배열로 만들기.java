class Solution {
    public int[] solution(long n) {
        String num = n + "";
        int a = num.length();
        int[] answer = new int [a];
        for (int i = 0; i <= a - 1 ; i++) {
            answer[i] = Integer.parseInt(String.valueOf(num.charAt(a - 1 - i)));
        }
        return answer;
    }
}