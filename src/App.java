import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		run();

	}

	
	// Methods
	public static void run() {
		
		System.out.println("         .-.   .-..-.    _       .-.                .-.   .-.                                                  ");
		System.out.println("         : :.-.: :: :   :_;      : :.-.             : :.-.: :                                                  ");
		System.out.println(",-----.  : :: :: :: `-. .-. .--. : `'.' .--. .--.   : :: :: : .--.  .--. ,-.,-.,-..-..-..---.  .--.   ,-----.  ");
		System.out.println(":-----:  : `' `' ;: .. :: :`._-.': . `.' '_.': ..'  : `' `' ;' .; ; : ..': ,. ,. :: :; :: .; ``._-.'  :-----:  ");
		System.out.println("`-----'   `.,`.,' :_;:_;:_;`.__.':_;:_;`.__.':_;     `.,`.,' `.__,_;:_;  :_;:_;:_;`.__.': ._.'`.__.'  `-----'  ");
		System.out.println("                                                                                        : :                    ");
		System.out.println("                                                                                        :_;                    ");
		System.out.println("                               --                         --                                                         ");
		System.out.println("                             .'  `.                     .'  `.                                                       ");
		System.out.println("                      ,-----.`-'`-' .--. .-..-..-. .--. `-'`-',-----.                                                ");
		System.out.println("                      :-----:      ' .; :: `; `; :' .; :      :-----:                                                ");
		System.out.println("                      `-----'      `.__.'`.__.__.'`.__.'      `-----'                                                ");
		System.out.println("                                                                       ");
		System.out.println("                                                                     ");
		System.out.println("                                                                     ");
		System.out.println("~*~*~ Welcome to Whisker Warmups! ~*~*~");
		
		boolean endProgram = false;	// To keep user running options until they want to end program
		boolean toContinue = true;	// To allow option for user to select another prompt
		Scanner theKeyboard = new Scanner(System.in);
		while (endProgram == false) {
			
			System.out.print("Please type which furry friend you want to draw (cat, dog, or either): ");
			String noun = theKeyboard.nextLine();
			PromptGenerator aPrompt = new PromptGenerator();
			
			if (aPrompt.getNoun(noun) == null) {
				
			}
			else {
				System.out.println(aPrompt.getNoun(noun) + " " + aPrompt.getRandomDescription() + "."); 
			}
			
			while (toContinue == true) {
				
				System.out.println("");
				System.out.print("Would you like another prompt? (Y/N) ");
				String response = theKeyboard.nextLine().toLowerCase();
				if (response.equals("y")) {
					endProgram = false;
					break;
				}
				else if (response.equals("n")) {
					endProgram = true;
					toContinue = false;
				}
				else {
					System.out.println("Invalid response.");
					toContinue = true;
				
				}
			
		}
			
		}

		System.out.println("Thank you for using Whisker Warmups! owo ");
	}
}
