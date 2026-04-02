class Solution {
    public int solution(int n) {
        int lcm = lcm(n, 6);
        return lcm / 6;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

