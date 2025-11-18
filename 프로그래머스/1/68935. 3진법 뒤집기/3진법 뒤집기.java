class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = "";
        while (n > 0) {
            a = n % 3 + a;
            n /= 3; 
        }
        String ans = new StringBuilder(a).reverse().toString();
        return  Integer.parseInt(ans, 3);
    }
}