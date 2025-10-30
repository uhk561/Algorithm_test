class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = x + "";
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            sum  += Integer.parseInt(num.substring(i, i + 1));
        }
        if(x % sum == 0) {
             return answer;
        } else {
            return answer = false;
        }
       
    }
}