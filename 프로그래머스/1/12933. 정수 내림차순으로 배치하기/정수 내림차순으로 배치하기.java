import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] strList = str.split("");
        Arrays.sort(strList, Comparator.reverseOrder());
     
        String strAnswer = String.join("", strList);
        
        answer = Long.parseLong(strAnswer);
        
        return answer;
    }
}