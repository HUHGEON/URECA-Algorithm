import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            String str = sc.next();
            
            if(str.equals("push")){
                int num = sc.nextInt();
                s.push(num);
            } else if (str.equals("pop")) {
                if(s.isEmpty()){
                    System.out.println("-1");
                }else {
                    System.out.println(s.pop());
                }

            } else if (str.equals("top")) {
                if(s.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(s.peek());
                }
            } else if (str.equals("size")) {
                System.out.println(s.size());
            } else{
                if (s.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }

    }
}

