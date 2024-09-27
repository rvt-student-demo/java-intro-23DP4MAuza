package lv.rvt;

import java.util.*;

public class App {
    public static void main(String[] args) { // definets vienu reizi un talak mes lietojam
                                             // scanner mainigo
                                             // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give me the first number: ");
        // int pirmais = Integer.valueOf(scanner.nextLine());

        // System.out.println("Give me the second number: ");
        // int otrais = Integer.valueOf(scanner.nextLine());

        // System.out.println(pirmais + " " + "+" + " " + otrais + " "+ "=" + " " +
        // pirmais + otrais);
        // System.out.println(pirmais + " " + "-" + " " + otrais + " " + "=" + " " +
        // (pirmais - otrais));
        // System.out.println(pirmais + " " + "*" + " " + otrais + " " + "=" + " " +
        // pirmais * otrais);
        // double result = pirmais / (double) otrais ;

        // System.out.println(pirmais + " " + "/" + " " +otrais + " " + "=" + " " +
        // result);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give speed: ");
        // int pirmais = Integer.valueOf(scanner.nextLine());

        // if (pirmais > 90) {
        // System.out.println("Speeding Ticket!");
        // }
        // if (pirmais < 90) {
        // System.out.println("No speeding ticket!");
        // }

        // int number = 3;

        // if (number == 1) {
        //     System.out.println("The number is one");
        // } else if (number == 2) {
        //     System.out.println("The given number is two");
        // } else if (number == 3) {
        //     System.out.println("The number must be three!");
        // } else {
        //     System.out.println("Something else!");
        // }

        //         Scanner scanner = new Scanner(System.in);

        //         System.out.println("Give points [0-100]: ");
        //         int points = Integer.valueOf(scanner.nextLine());

        //         if (points < 0) {
        //             System.out.println("impossible!");
        //         } else if (points > 100) {
        //             System.out.println("incredible!");
        //         } else if (points <= 49) {
        //             System.out.println("failed");
        //         } else if (points <= 59) {
        //             System.out.println("1");
        //         } else if (points <= 69) {
        //             System.out.println("2");
        //         } else if (points <= 79) {
        //             System.out.println("3");
        //         } else if (points <= 89) {
        //             System.out.println("4");
        //         } else {
        //             System.out.println("5");
        //         }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of the gift? ");
        double giftValue = scanner.nextDouble();

        if (giftValue <= 5000) {
            System.out.println("No tax!");
        } else if (giftValue <= 25000) {
            double tax = 100 + (giftValue - 5000) * 0.08;
            System.out.printf("Tax: ", tax);
        } else if (giftValue <= 55000) {
            double tax = 1700 + (giftValue - 25000) * 0.10;
            System.out.printf("Tax: ", tax);
        } else if (giftValue <= 200000) {
            double tax = 4700 + (giftValue - 55000) * 0.12;
            System.out.printf("Tax: ", tax);
        } else if (giftValue <= 1000000) {
            double tax = 22100 + (giftValue - 200000) * 0.15;
            System.out.printf("Tax: ", tax);
        } else {
            double tax = 142100 + (giftValue - 1000000) * 0.17;
            System.out.printf("Tax: ", tax);
        }
    }
}