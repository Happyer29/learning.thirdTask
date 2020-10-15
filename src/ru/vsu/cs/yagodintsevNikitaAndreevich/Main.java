package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        printColorForPoint(-10, 1);
        printColorForPoint(-5, 3);
        printColorForPoint(2, 5);
        printColorForPoint(9, 6);
        printColorForPoint(2, 0);
        printColorForPoint(6, 0);
        printColorForPoint(3, -4);
        printColorForPoint(0, 0);
        printColorForPoint(0, -4);
        printColorForPoint(2, -5);
        printColorForPoint(-1.5, -4.5);
        printColorForPoint(-1, -6);
        printColorForPoint(-10, -1);


        System.out.print("Введите x для проверки цвета: ");
        double xIn = scanner.nextDouble();

        System.out.print("Введите y для проверки цвета: ");
        double yIn = scanner.nextDouble();

        printColorForPoint(xIn, yIn);

    }

    public static void printColorForPoint(double x, double y) {
        Program program = new Program();
        System.out.println("(" + x + ", " + y + ") color: " + program.getColor(x, y));
    }
}
