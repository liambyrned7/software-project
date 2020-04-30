import java.util.Scanner;

public class index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int choice = 0;

	System.out.println("Select an option (1-8):");
	System.out.println();
	System.out.println("1. Exercise 1");
    System.out.println("2. Exercise 2");
    System.out.println("3. Exercise 3");
    System.out.println("4. Exercise 4");
    System.out.println("5. Exercise 5");
    System.out.println("6. Exercise 6");
    System.out.println("7. Exercise 7");
	System.out.println("8. Exit");

	System.out.println();

	System.out.print("Choice: ");
	choice = input.nextInt();
	System.out.println();

	if(choice == 1){
		System.out.println("Exercise 1");
		System.out.println();
		exercise1.main(null); 
	}else if(choice == 2){
		System.out.println("Exercise 2");
		System.out.println();
        exercise2.main(null);
    }else if(choice == 3){
		System.out.println("Exercise 3");
		System.out.println();
        exercise3.main(null);
    }else if(choice == 4){
		System.out.println("Exercise 4");
		System.out.println();
        exercise4.main(null);
    }else if(choice == 5){
		System.out.println("Exercise 5");
		System.out.println();
        exercise5.main(null);
    }else if(choice == 6){
		System.out.println("Exercise 6");
		System.out.println();
        exercise6.main(null);
    }else if(choice == 7){
		System.out.println("Exercise 7");
		System.out.println();
		exercise7.main(null);   
	}else{
		System.out.println("Exit");
		System.out.println();
	}
  }
}