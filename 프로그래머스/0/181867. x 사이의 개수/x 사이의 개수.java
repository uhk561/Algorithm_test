class Solution {
    public int[] solution(String myString) {
        
        int count = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                count++;
            }
        }
        
        int[] answer = new int[count + 1];
        
        int idx = 0;
        int len = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            
            if(myString.charAt(i) == 'x') {
                answer[idx] = len;
                idx++;
                len = 0;
            } else {
                len++;
            }
        }
        
        answer[idx] = len;
        
        return answer;
    }
}