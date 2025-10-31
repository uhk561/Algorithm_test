class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        if (a > b) {
            big = a;
            small = b;
        } else if  (a < b) {
            big = b;
            small = a;
        } else if (a == b) {
            answer = a;
        }
        for(int i = small; i <= big; i++ ) {
            answer += i;
        }
        return answer;
    }
}