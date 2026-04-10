class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int a = p.length();
        int b = t.length();
        
        for(int i = 0; i < b - a + 1; i++){
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i,i+a))){
                answer++;
            }
        }
        return answer;
    }
}