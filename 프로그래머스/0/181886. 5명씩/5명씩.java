import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];

        int count = 0;

        for(int i = 0; i < names.length; i += 5) {
            answer[count] = names[i];
            count++;
        }

        return answer;
    }
}