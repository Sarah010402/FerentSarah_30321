package Lab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise1 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number:");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number:");
        int b = Integer.parseInt(br.readLine());
        if(a >= b){
            System.out.println("The bigger number is: " + a);
        }
        else
            System.out.println("The bigger number is: " + b);

    }
}
