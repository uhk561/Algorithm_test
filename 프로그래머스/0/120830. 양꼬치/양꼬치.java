class Solution {
    public int solution(int n, int k) {
        int lambCost = n * 12000;         
        int freeDrinks = n / 10;         
        int drinkCost = (k - freeDrinks) * 2000; 

        return lambCost + drinkCost;
    }
}
