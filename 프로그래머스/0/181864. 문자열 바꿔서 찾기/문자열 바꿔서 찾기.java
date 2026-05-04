class Solution {
    public int solution(String myString, String pat) {
        String changed = myString
                .replace("A", "X")
                .replace("B", "A")
                .replace("X", "B");
        
        return changed.contains(pat) ? 1 : 0;
    }
}