package find_sequence;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();

            String line = reader.readLine();

            int index = 0;
            char low = line.charAt(0);

            for (int i = line.length() - 1; i >= 0; i--) {
                if (line.charAt(i) < low) {
                    index = i;
                    low = line.charAt(i);
                }
            }

            System.out.println(line.substring(index));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
