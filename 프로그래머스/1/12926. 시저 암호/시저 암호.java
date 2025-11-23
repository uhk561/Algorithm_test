class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char a : s.toCharArray()) {

            if (a == ' ') {
                sb.append(' ');
                continue;
            }

            if (a >= 'A' && a <= 'Z') {
                char shifted = (char)((a - 'A' + n) % 26 + 'A');
                sb.append(shifted);
            }
            else if (a >= 'a' && a <= 'z') {
                char shifted = (char)((a - 'a' + n) % 26 + 'a');
                sb.append(shifted);
            }
        }

        return sb.toString();
    }
}
