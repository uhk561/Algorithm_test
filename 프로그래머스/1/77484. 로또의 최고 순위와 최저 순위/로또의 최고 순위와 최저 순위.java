class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else {
                for (int win : win_nums) {
                    if (num == win) {
                        matchCount++;
                        break;
                    }
                }
            }
        }

        int maxMatch = matchCount + zeroCount;  
        int minMatch = matchCount;             

        return new int[]{rank(maxMatch), rank(minMatch)};
    }

    private int rank(int match) {
        switch (match) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
