package Lab2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int n, i, j, aux;
        Scanner input = new Scanner(System.in);

        System.out.println("N =");
        n = input.nextInt();
        int a[] = new int[n];

        for (i = 0; i < n; i++)
            a[i] = input.nextInt();
        for (i = 0; i < ( n - 1 ); i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1])
                {
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        for (i = 0; i < n; i++)
            System.out.print(a[i]);
    }
}
