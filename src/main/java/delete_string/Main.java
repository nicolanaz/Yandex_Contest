package delete_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String line = reader.readLine();

            int left = 0;
            int right = line.length() - 1;

            char current = line.charAt(left);

            while (left < right && line.charAt(left) == current && line.charAt(right) == current) {
                if (right - left == 1) {
                    System.out.println(0);
                    return;
                }

                while (line.charAt(left) == current) {
                    left++;
                }

                while (line.charAt(right) == current) {
                    right--;
                }

                current = line.charAt(left);
            }

            System.out.println(right - left != 0 ? right - left + 1 : 1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//zzzaabxxxcazz