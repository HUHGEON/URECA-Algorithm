import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        while (!n.equals("0")){
            boolean equals = true;

            for(int i = 0; i < (n.length() / 2) ; i++){
                if(n.charAt(i) != n.charAt(n.length() -1 - i)){
                    equals = false;
                }
            }
            if (equals == false){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
            n = sc.next();
        }
    }
}

//홀수 ex 5 -> 1 5 2 4 가 같아햐함
//짝수 ex 6 -> 1 6 2 5 3 4 가 같아야함
