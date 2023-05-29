package number_gaps;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String gap = reader.readLine();

            String numbers = gap.substring(1, gap.length() - 1);
            String[] parts = numbers.split(", ");

            int x;
            int y;

            if (parts[0].contains("/")) {
                Double a = Double.parseDouble(parts[0].split("/")[0]);
                int b = Integer.parseInt(parts[0].split("/")[1]);

                x = (int) Math.ceil(a / b);
            } else {
                x = Integer.parseInt(parts[0]);
            }

            if (parts[1].contains("/")) {
                double a = Double.parseDouble(parts[1].split("/")[0]);
                int b = Integer.parseInt(parts[1].split("/")[1]);

                y = (int) Math.floor(a / b);
            } else {
                y = Integer.parseInt(parts[1]);
            }

            int result = y - x;

            if (parts[0].contains("/") && parts[1].contains("/")) {
                System.out.println(result + 1);
                return;
            }

            if (gap.startsWith("[") && !parts[0].contains("/")) result++;
            if (gap.endsWith("]") && !parts[1].contains("/")) result++;

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
