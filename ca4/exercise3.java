import java.util.Scanner;

public class exercise3{
        public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);

            int number = 0;
            int age = 20;

            System.out.print("Enter a number: ");
            number = input.nextInt();

            if(number > age){
            	System.out.println(number+" is greater than my age.");
            }else if(number < age){
                System.out.println(number+" is less than my age.");
            }else{
				System.out.println(number+" matches my age.");    
			}
        }
}