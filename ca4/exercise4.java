import java.util.Scanner;

public class exercise4{
    public static void main(String[] args){
            
        Scanner input = new Scanner(System.in);

        int number = 0;
        int counter = 1;

        while((number > 10 || number <= 0)){

            System.out.print("Enter a number from 1 to 10: ");
            number = input.nextInt();

            if((number > 10 || number <= 0)){
                System.out.println("Invalid number entered. Please try again");
            }else{
		        while(counter <= number){
			        System.out.println(counter+". Liam");
			        counter = counter + 1;
	            }
            }
        }

        index.main(null);
    }
}