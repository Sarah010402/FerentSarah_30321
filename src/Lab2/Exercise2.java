package Lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number:");
        int a = Integer.parseInt(br.readLine());
        String numberString;
/*
    switch (a) {

        case 1: numberString = "ONE";

            break;

        case 2: numberString = "TWO";

            break;

        case 3: numberString = "THREE";

            break;

        case 4: numberString = "FOUR";

            break;

        case 5: numberString = "FIVE";

            break;

        case 6: numberString = "SIX";

            break;

        case 7: numberString = "SEVEN";

            break;

        case 8: numberString = "EIGHT";

            break;

        case 9: numberString = "NINE";

            break;

        default: numberString = "Other";

            break;

    } System.out.println(numberString);*/

    if(a == 1)
        System.out.println("ONE");
    else
    if(a == 2)
        System.out.println("TWO");
    else
    if(a == 3)
        System.out.println("THREE");
    else
    if(a == 4)
        System.out.println("FOUR");
    else
    if(a == 5)
        System.out.println("FIVE");
    else
    if(a == 6)
        System.out.println("SIX");
    else
    if(a == 7)
        System.out.println("SEVEN");
    else
    if(a == 8)
        System.out.println("EIGHT");
    else
    if(a == 9)
        System.out.println("NINE");
    else
        System.out.println("OTHER");
}
}
