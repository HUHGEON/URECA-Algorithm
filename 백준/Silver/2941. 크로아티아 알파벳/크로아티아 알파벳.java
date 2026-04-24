import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cro = sc.nextLine();
        String alpha [] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < alpha.length; i++){
            cro = cro.replaceAll(alpha[i], "*");
        }

        System.out.println(cro.length());
    }
}

