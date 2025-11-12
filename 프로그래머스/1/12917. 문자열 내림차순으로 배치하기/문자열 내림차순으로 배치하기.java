import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> list = new ArrayList<>();

        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            answer.append(list.get(i));
        }

        return answer.toString();
    }
}
