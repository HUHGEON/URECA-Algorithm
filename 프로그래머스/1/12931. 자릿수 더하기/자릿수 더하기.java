import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = (int)(Math.log10(n) + 1);
        
        for (int i = length; i >= 0; i--){
            answer += n/Math.pow(10,i);
            n %= Math.pow(10,i);
        }

        return answer;
    }
}