package count_the_negative;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();

            int n = Integer.parseInt(line.split(" ")[0]);
            int m = Integer.parseInt(line.split(" ")[1]);

            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                matrix[i] = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            int index = m - 1;
            int result = 0;

            for (int i = 0; i < n; i++) {
                if (matrix[i][index] < 0) {
                    result += n - i;

                    if (i == n - 1 && index == 0) break;

                    i--;
                    if (index != 0) {
                        index--;
                    }
                }
            }

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//4 4
//4 3 2 -1
//3 2 1 -1
//1 1 -1 -2
//-1 -1 -2 -3