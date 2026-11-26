
class Solution {
    public int solution(String before, String after) {
        int answer = 1;

        for(int i = 0; i < before.length(); i++) {
            int count = 0;
            int count2 = 0;

            for(int j = 0; j < before.length(); j++) {
                if(before.charAt(i) == before.charAt(j)) {
                    count++;
                }
                if(before.charAt(i) == after.charAt(j)) {
                    count2++;
                }
            }
            
            if(count != count2) {
                answer = 0;
                break;
            }
        }

        return answer;
    }
}
