class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        int idx2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > idx) {
                idx = array[i];
                idx2 = i;
            }
        }
        int[] answer = {idx, idx2};
        return answer;
    }
}