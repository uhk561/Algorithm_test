class Solution {
    public int solution(int n) {
        int count = 0;
        for (int a = 1; a * a <= n; a++) {
            if (n % a == 0) {
                int b = n / a;
                if (a == b) count += 1;   
                else count += 2;         
            }
        }
        return count;
    }
}
