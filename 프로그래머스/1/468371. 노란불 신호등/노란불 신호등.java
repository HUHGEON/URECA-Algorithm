import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int max = 3200000;
        
        for(int i = 0; i < max; i++){
            boolean isYellow = true;
            
            for(int j = 0; j < signals.length; j++){
                int g = signals[j][0];
                int y = signals[j][1];
                int r = signals[j][2];
                
                int cycle = g + y + r;
                int t = i % cycle;
                
                if(!(t >= g && t < g+y)){
                    isYellow = false;
                    break;
                }
            }
            
            if(isYellow){
                return i+1;
            }
        
        }
        
        return -1;
    }
}