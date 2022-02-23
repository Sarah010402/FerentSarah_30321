package Lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.* ;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Guess the number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int random = r.nextInt(10) + 1;
        int a = Integer.parseInt(br.readLine());
        int x = 3;
        while(x!=0){
        if(a == random){
            System.out.println("You won!");
            break;
            }
        if(a < random){
            System.out.println("Wrong answer, your number is too low");
            x--;
            a = Integer.parseInt(br.readLine());
        }
        if(a > random){
            System.out.println("Wrong answer, your number is too high");
            x--;
            a = Integer.parseInt(br.readLine());
    }}
}}
