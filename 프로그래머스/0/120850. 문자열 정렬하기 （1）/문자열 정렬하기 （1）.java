import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                count++;
            }
        }
        int[] answer = new int[count];
        int index = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                answer[index++] = c - '0';
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}