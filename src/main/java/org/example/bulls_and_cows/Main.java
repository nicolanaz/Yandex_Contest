package org.example.bulls_and_cows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String v = reader.readLine();
            String p = reader.readLine();

            int bulls = 0;
            int cows = 0;

            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == v.charAt(i)) {
                    bulls++;
                    v = v.replaceFirst(String.valueOf(p.charAt(i)), "-");
                } else if (v.contains(String.valueOf(p.charAt(i)))) {
                    cows++;
                    v = v.replaceFirst(String.valueOf(p.charAt(i)), "-");
                }
            }

            System.out.println(bulls);
            System.out.println(cows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
