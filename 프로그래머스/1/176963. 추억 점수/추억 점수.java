class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                for(int t = 0; t < name.length; t++){
                    if(photo[i][j].equals(name[t])){
                        answer[i] += yearning[t];
                    }
                }
            }
        }
        
        return answer;
    }
}