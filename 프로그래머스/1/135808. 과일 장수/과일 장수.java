import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        int n = score.length;
        if(n % m == 0){
            for(int i =0; i < n/m; i++){
                answer += score[m*i]*m;
            }
        }
        else {
            for(int j = 0; j < n/m; j++){
                answer += score[m*j + n % m]*m;
            }
        }
        return answer;
    }
}