class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String prev = "";
            boolean canSay = true;
            
            while (!word.isEmpty()) {
                boolean found = false;
                for (String s : sounds) {
                    if (word.startsWith(s) && !s.equals(prev)) {
                        prev = s;
                        word = word.substring(s.length());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    canSay = false;
                    break;
                }
            }
            
            if (canSay) answer++;
        }
        
        return answer;
    }
}
