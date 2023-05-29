package pitcraft;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(reader.readLine());
            int[] mountains = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int result = 0;
            int max = mountains[0];

            for (int i = 1; i < n; i++) {
                if (mountains[i] < max) {
                    result += max - mountains[i];
                } else {
                    max = mountains[i];
                }
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
