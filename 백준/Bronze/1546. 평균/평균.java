import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        double averge = 0;
        for (int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);

        for(int i = 0; i < n; i++){
            averge += (double) (score[i] * (100.0 / score[n - 1])) / n; //double 계산처리 잘생각하기
        }

        System.out.println(averge);

    }
}

// 평균 (원점수 합) * (100/최고점수)
