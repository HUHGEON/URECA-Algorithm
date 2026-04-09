class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int y = (num - 1) / w;
        int x = (y % 2 == 0)? ((num -1) % w) : ((w - 1) - ((num -1) % w));
        
        int ny = (n - 1) / w;
        int nx = (ny % 2 == 0)? ((n -1) % w) : ((w - 1) - ((n -1) % w));                   
        if(ny % 2 == 0){
            if(nx - x >= 0){
                answer = ny -y + 1;
            }else{
                answer = ny -y;
            }
        }else{
            if(nx -x > 0){
                answer = ny -y;
            }else{
                answer = ny -y +1;
            }
        }
        return answer;
    }
}