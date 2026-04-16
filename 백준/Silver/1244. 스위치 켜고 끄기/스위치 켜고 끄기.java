import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strToken = null;

        int N = Integer.parseInt(bufRead.readLine());
        int[] switches = new int[N + 1];

        strToken = new StringTokenizer(bufRead.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            switches[i] = Integer.parseInt(strToken.nextToken());
        }

        int T = Integer.parseInt(bufRead.readLine());
        for (int j = 1; j <= T; j++) {
            strToken = new StringTokenizer(bufRead.readLine(), " ");
            int gender = Integer.parseInt(strToken.nextToken());
            int idx = Integer.parseInt(strToken.nextToken());

            if (gender == 1) { // 남학생
                for (int i = idx; i <= N; i += idx) {
                    if (switches[i] == 0) {
                        switches[i] = 1;
                    } else {
                        switches[i] = 0;
                    }
                }
            } else { // 여학생
                switches[idx] = switches[idx] == 0 ? 1 : 0;
                if (idx != 1 && idx != N && switches[idx - 1] == switches[idx + 1]) {
                    int lidx = idx - 1;
                    int ridx = idx + 1;
                    while (lidx > 0 && ridx <= N && switches[lidx] == switches[ridx]) {
                        switches[lidx] = switches[lidx] == 0 ? 1 : 0;
                        switches[ridx] = switches[ridx] == 0 ? 1 : 0;
                        lidx--;
                        ridx++;
                    }
                }
            }
        }

        bufRead.close();

        StringBuilder stringBuild = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            stringBuild.append(switches[i]).append(" ");
            if (i % 20 == 0) {
                stringBuild.append("\n");
            }
        }
        System.out.println(stringBuild.toString().trim());
    }
}