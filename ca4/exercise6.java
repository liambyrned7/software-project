import java.util.Scanner;


public class exercise6{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
            
            String symbol;
            int rows = 0;
            int columns = 0;

            System.out.print("Enter a symbol: ");
            symbol = input.next();

            System.out.print("Enter number of rows: ");
            rows = input.nextInt();

            System.out.print("Enter number of columns: ");
            columns = input.nextInt();

            for(int a = 1; a <= rows; a = a + 1){
                for(int b = 1; b <= columns; b = b + 1){
                    System.out.print(symbol);
                }
                System.out.println();
            }
    }
}