package lv.rvt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortedTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = new ArrayList<>();

        System.out.println("Ievadi masīva elementus (integer) (Ievadiet tukšu lauku lai beigtu)");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int element = Integer.parseInt(input);
            intList.add(element);
        }

        intList.sort(Comparator.naturalOrder());


        System.out.println("\n========== Augošā secība ==========");
        System.out.println("Indeks   Vērtība ");
        System.out.println("=====================================");
        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d\t%d%n", i, intList.get(i));
        }

        intList.sort(Comparator.reverseOrder());

        System.out.println("\n========== Dilstošā secība ==========");
        System.out.println("Indeks   Vērtība ");
        System.out.println("=====================================");
        for (int i = 0; i < intList.size(); i++) {
            System.out.printf("%d\t%d%n", i, intList.get(i));
        }
    }
}