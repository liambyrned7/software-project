import java.util.Scanner;

public class exercise2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int plus = 0;
        int minus = 0;
        int multiply = 0;

        System.out.print("Enter first number: ");
        first = input.nextInt();

        System.out.print("Enter second number: ");
        second = input.nextInt();

        plus = first + second;
        System.out.println(first+" + "+second+" = "+plus);

        minus = first - second;
        System.out.println(first+" - "+second+" = "+minus);

        multiply = first * second;
        System.out.println(first+" x "+second+" = "+multiply);
   }
}