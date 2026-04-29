class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int vlen = split(video_len);
        int pos1 = split(pos);
        int opStart = split(op_start);
        int opEnd = split(op_end);
        
        if (pos1 >= opStart && pos1 <= opEnd) {
            pos1 = opEnd;
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("next")) {
                if (vlen - pos1 < 10) {
                    pos1 = vlen;
                } else {
                    pos1 += 10;
                }
            } else {
                if (pos1 < 10) {
                    pos1 = 0;
                } else {
                    pos1 -= 10;
                }
            }
            
            if (pos1 >= opStart && pos1 <= opEnd) {
                pos1 = opEnd;
            }
        }
        
        int m = pos1 / 60;
        int s = pos1 % 60;
        

        String answer = String.format("%02d:%02d", m, s);
        
        return answer;
    }
    
    public int split(String time) {
        String[] times = time.split(":");
        int min = Integer.parseInt(times[0]);
        int sec = Integer.parseInt(times[1]);
        return (min * 60) + sec;
    }
}