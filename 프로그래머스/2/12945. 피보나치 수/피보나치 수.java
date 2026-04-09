class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] a = new int [n + 1];
        a[0] = 0;
        a[1] = 1;
        
        for(int i = 2; i < n+1; i++){
            a[i] = (a[i-2] + a[i-1]) % 1234567;
        }
        answer = a[n];
        
        return answer;
    }
}