import java.util.Scanner;
public class Number_Guess {
	public static void	guessingNumberGame()
	{
		try (
		Scanner sc = new Scanner(System.in)) {
			int number = 1 + (int)(100	* Math.random());
			int d = 7;
			int s=7;
			int i, guess;
			System.out.println(	"\nA number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 7 trials.");
			for (i = 0; i < d; i++) {
				System.out.println(	"Guess the number:");
				guess = sc.nextInt();
				if (number == guess) {
					System.out.println(	"Congratulations!"+ " You guessed the number.");
			        System.out.println("your score is "+s+" out of 7");
					break;
				}
				else if (number > guess && i != d - 1) {
					System.out.println("The number is "+ "greater than " + guess);
				}
				else if (number < guess
						&& i != d - 1) {
					System.out.println("The number is"+ " less than " + guess);
				}
			    s--;
			}

			if (i == d) {
				System.out.println("You have exhausted "+  d+" trials.");
				System.out.println("The number was " + number);
				System.out.println("your score is -1 out of 7");
			}
			System.out.println("\n\nEnter 'y' to Play again or press any other dey to stop");
			sc.nextLine();
			char c=sc.nextLine().charAt(0);
			if(c=='y'||c=='Y')
			{
			    guessingNumberGame();
			}
		}
	}

	public static void
	main(String arg[])
	{

		System.out.println("How to Play:-");
        System.out.println("1. Computer generates a random number");
        System.out.println("2. Guess the number 1 and 100 to win");
        System.out.println("3. You will be given 7 trial");
		guessingNumberGame();
		System.out.println("\n Thand You for Playing");
	}
}