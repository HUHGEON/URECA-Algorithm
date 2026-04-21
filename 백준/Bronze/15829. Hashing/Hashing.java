import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String hash = sc.next();

        int hashCode = 0;
        int M = 1234567891;

        for(int i= 0; i < L; i++){
            int code = hash.charAt(i) - 'a' + 1;
            hashCode += (code * (int)(Math.pow(31 , i)) % M);
        }

        System.out.println(hashCode);
    }
}

