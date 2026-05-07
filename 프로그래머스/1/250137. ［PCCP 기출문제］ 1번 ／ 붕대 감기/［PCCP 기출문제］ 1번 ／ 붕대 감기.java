class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currHealth = health;
        int maxHealth = health;
        int lastTime = 0;

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            int duration = attackTime - lastTime - 1;
            
            if (duration > 0) {
                int totalHeal = (duration * bandage[1]) + (duration / bandage[0] * bandage[2]);
                currHealth = Math.min(maxHealth, currHealth + totalHeal);
            }

            currHealth -= damage;
            if (currHealth <= 0) return -1;

            lastTime = attackTime;
        }

        return currHealth;
    }
}