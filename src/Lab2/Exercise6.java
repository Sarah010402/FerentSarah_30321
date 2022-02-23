package Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6 {
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else {
            return (n * factorial(n-1));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("N:");
        int n = Integer.parseInt(br.readLine());
        int i, s=1;

        for(i = 1; i <= n; i++){
            s = i * s;
        }
        System.out.println("N!= " + s);
/*

        s = factorial(n);
        System.out.println("N!=" + s);*/

    }

}
