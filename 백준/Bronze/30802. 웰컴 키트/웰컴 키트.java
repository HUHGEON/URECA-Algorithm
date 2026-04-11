import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        
        int[] size = new int[6];
        for(int i = 0; i < 6; i++){
            size[i] = sc.nextInt();
        }
        
        int t = sc.nextInt();
        int p = sc.nextInt();
        
        int totalT = 0;
        for(int i = 0; i < 6; i++){
            if(size[i] > 0) {
                totalT += (size[i] - 1) / t + 1;
            }
        }
        System.out.println(totalT);

        System.out.println((n / p) + " " + (n % p));
    }
}