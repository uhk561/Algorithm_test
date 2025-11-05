class Solution {
    public String solution(String phone_number) {
        String star = "";
        String number = phone_number.substring(phone_number.length() - 4); 
        for (int i = 0; i <= phone_number.length() - 5; i++) {
            star += "*";
        }
        String answer =  star + number;
        return answer;
    }
}