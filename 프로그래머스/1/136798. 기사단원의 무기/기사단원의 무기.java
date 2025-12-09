class Solution {
    public int solution(int number, int limit, int power) {
        int total = 0;

        for (int i = 1; i <= number; i++) {
            int divCount = getDivCount(i);

            if (divCount > limit) {
                total += power;
            } else {
                total += divCount;
            }
        }
        return total;
    }
    private int getDivCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;            
                if (i * i != n) {
                    count++;       
                }
            }
        }
        return count;
    }
}
