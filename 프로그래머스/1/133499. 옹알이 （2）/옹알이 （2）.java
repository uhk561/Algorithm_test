public class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String temp = word;
            String prev = "";
            boolean valid = true;

            while (!temp.isEmpty()) {
                boolean matched = false;

                for (String sound : sounds) {
                    if (temp.startsWith(sound) && !sound.equals(prev)) {
                        temp = temp.substring(sound.length());
                        prev = sound;
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    valid = false;
                    break;
                }
            }

            if (valid) count++;
        }

        return count;
    }
}
