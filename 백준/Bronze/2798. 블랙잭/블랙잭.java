import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;

        int num [] = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){     //i 이후의 카드 선택
                for(int k = j + 1; k < n; k++){     //j 이후의 카드 선택
                    int sum = num[i] + num[j] + num[k];

                    if(sum > max && sum <= m){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

