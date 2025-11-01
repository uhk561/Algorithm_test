class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long number = num;
            while (count < 500 && number != 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                    count++;
                } else if (number % 2 != 0 ) {
                    number = (number * 3) + 1;
                    count++;
                }
            }
     
        if (count >= 500) {
            answer = -1;
        } else {
            answer = count;
        }
        return answer;
    }
}