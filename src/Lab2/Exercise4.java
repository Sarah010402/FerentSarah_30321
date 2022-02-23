package Lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] arg)throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);


        System.out.print("N=");
        int N = input.nextInt();
        int a [] = new int [N];
        for (int i=0; i<N; i++) {
            a[i] = input.nextInt();
        }
        int max = a[0];
        for(int i=1; i<N;i++)
        {
            if (a[i]>max)
                max = a[i];
        }
        System.out.print("The biggest number is "+ max);
    }
}
