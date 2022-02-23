package Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {
    public static void main(String[] arg)throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("a =");
        int a = Integer.parseInt(x.readLine());
        System.out.print("b =");
        int b = Integer.parseInt(x.readLine());

        int d = 0,k = 0, i, j;
        for(i = a; i <= b; i++) {
            for(j = 1; j <= i; j++) {
                if(i % j == 0)
                    d++;
            }
            if(d == 2){
                k++;
                System.out.println(i+" ");}
            d=0;
        }
        System.out.println("k = " + k);
    }
}
