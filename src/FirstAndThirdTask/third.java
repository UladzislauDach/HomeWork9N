package FirstAndThirdTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        dif();
    }

    public static void dif() {
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("notOnlyNumbers.txt"))) {
            Scanner sc = new Scanner(br);
            while (sc.hasNextLine()) {
                arr.add(sc.nextLine());
            }
        } catch (IOException e) {
            e.getMessage();
        }
        String str;
        int dif = 0;
        for (int i = 0; i < arr.size(); i++) {
            str = arr.get(i);
            if (str.matches("\\d+")) {
                dif = dif + Integer.parseInt(arr.get(i));
            }
        }
        System.out.println("Сумма чисел = " + dif);
    }

}

