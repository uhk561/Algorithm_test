class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int a = 0;
        for(int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
                answer = i;
            }
        }
         for(int i = 0; i < sides.length; i++) {
             if(answer != i) {
                a += sides[i];
             }
         }
        if(a > max) answer = 1;
        if(a <= max) answer = 2;
        
        return answer;
    }
}