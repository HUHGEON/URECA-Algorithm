    /* 0시일때 -> 서버수 = 이용자 / m 
       1시일때 -> 서버수 = 이용자 / m 
    */




    class Solution {
        public int solution(int[] players, int m, int k) {
            int answer = 0;
            int num = 0;
            int down [] = new int [players.length + k];

            for (int i = 0; i < players.length; i++) {
                num -= down[i];
                
                int serv = players[i]/m;
                
                if(serv > num){
                    int diff = serv - num;
                    answer += diff;
                    num += diff;
                    
                    down[i + k] = diff;

                }
                                
                
            }
            return answer;
        }
    }