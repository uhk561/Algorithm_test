class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0; // 단어별 문자 인덱스

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += " ";
                index = 0; // 공백 만나면 단어 새로 시작
            } else {
                if (index % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                index++;
            }
        }

        return answer;
    }
}
