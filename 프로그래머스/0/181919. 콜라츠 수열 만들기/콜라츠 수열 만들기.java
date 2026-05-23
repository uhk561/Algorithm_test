class Solution {
    public int[] solution(int n) {
        
        int temp = n;
        int count = 1;
        
        while(temp != 1) {
            if(temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = 3 * temp + 1;
            }
            count++;
        }
        
        int[] answer = new int[count];
        
        answer[0] = n;
        
        int idx = 1;
        
        while(n != 1) {
            
            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            answer[idx] = n;
            idx++;
        }
        return answer;
    }
}