/*
 뭉치 2개 받음 -> 뭉치에서 카드를 순서대로 한장씩 사용(재사용 불가, 순서 넘기기 불가)
*/

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int card1 =0;
        int card2 =0;
        for(String word : goal){
            if (card1 < cards1.length && word.equals(cards1[card1])){
                card1++;
            }else if (card2 < cards2.length && word.equals(cards2[card2])){
                card2++;
            }else{
                answer = "No";
                break;
            }
        }
        if (card1 + card2 == goal.length){
            answer = "Yes";
        }else{
            answer = "No";
        }
        return answer;
    }
}