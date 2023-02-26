package pl.javastart.task;

import java.util.Scanner;

public class ArrayCreator {
    Scanner scanner = new Scanner(System.in);

    int readSize() {
        int size;
        do {
            System.out.println("Podaj rozmiar tablicy:");
            size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Rozmiar tablicy musi byc liczba calkowita wieksza od zera.");
            }
        }  while (size <= 0);
        return size;
    }

    public double[] createArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public double getSqrSum(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += Math.pow(element, 2);
        }
        return sum;
    }
}
