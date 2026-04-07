class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++){
            cost = i*price;
            sum += cost;
        }
        if (sum - money <= 0){
            return 0;
        }
        else {
            return sum - money;
        }
      
    }
}