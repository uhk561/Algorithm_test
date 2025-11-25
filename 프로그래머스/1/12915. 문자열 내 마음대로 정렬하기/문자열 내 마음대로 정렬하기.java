import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (str, str2) -> {
            if (str.charAt(n) == str2.charAt(n)) {
                return str.compareTo(str2);
            }
            return str.charAt(n) - str2.charAt(n);
        });

        return strings;
    }
}
