import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 테스트 횟수

        for (int i = 0; i < n; i++) {
            int cnt = Integer.parseInt(br.readLine()); // 의류 개수

            Map<String, Integer> clothes = new HashMap<>();
            int ans = 1;

            for (int j = 0; j < cnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();

                clothes.put(type, clothes.getOrDefault(type, 1) + 1);
            }

            for (int v : clothes.values()) {
                ans *= v;
            }

            System.out.println(ans - 1);
        }
    }
}
