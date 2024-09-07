/*
Short Description:  This program will accept two rational numbers as input from the console.  It will add those two
                    rational numbers and print the sum.  It will subtract, multiply, and the divide the two rational
                    numbers.  Finally, it will print the second rational number as a double.  The implementation of
                    the Rational class is with BigIntegers
Author:  Brian Wiatrek
Date:  September 7, 2024
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        String delims = "[ \\\\/]+";
        System.out.println("Enter the first rational number:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumbers = reader.readLine();
        String[] tokens = inputNumbers.split(delims);
        long firstNum = Long.parseLong(tokens[0]);
        long secondNum = Long.parseLong(tokens[1]);
        Rational firstRational = new Rational(BigInteger.valueOf(firstNum), BigInteger.valueOf(secondNum));

        System.out.println("Enter the second rational number:");
        reader = new BufferedReader(new InputStreamReader(System.in));
        inputNumbers = reader.readLine();
        tokens = inputNumbers.split(delims);
        firstNum = Long.parseLong(tokens[0]);
        secondNum = Long.parseLong(tokens[1]);
        Rational secondRational = new Rational(BigInteger.valueOf(firstNum), BigInteger.valueOf(secondNum));

        System.out.printf("%s + %s = %s\n", firstRational, secondRational, firstRational.add(secondRational).toString());
        System.out.printf("%s - %s = %s\n", firstRational, secondRational, firstRational.subtract(secondRational));
        System.out.printf("%s * %s = %s\n", firstRational, secondRational, firstRational.multiply(secondRational));
        System.out.printf("%s / %s = %s\n", firstRational, secondRational, firstRational.divide(secondRational));
        System.out.printf("%s is %.19f\n", secondRational, secondRational.doubleValue());
    }
}