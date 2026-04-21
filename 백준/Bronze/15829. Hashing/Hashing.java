import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String hash = sc.next();

        long hashCode = 0;
        long M = 1234567891;
        long pow = 1;

        for(int i= 0; i < L; i++){
            int code = hash.charAt(i) - 'a' + 1;
            hashCode += (code * pow % M);
            pow = pow * 31 % M;
        }

        System.out.println(hashCode);
    }
}

