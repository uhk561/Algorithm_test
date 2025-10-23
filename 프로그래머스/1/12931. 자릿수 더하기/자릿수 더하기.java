import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = n + "";  
        for (int i = 1; i <= num.length(); i++) {
            answer += Integer.parseInt(num.substring(i - 1, i));
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    };
}