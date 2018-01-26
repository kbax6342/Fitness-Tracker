package Business;

import java.util.Scanner;


public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanners
		Scanner answer = new Scanner(System.in);
		Scanner chestAnswer = new Scanner(System.in);
		
		//Strings
		String firstName;
		String lastName;
		String email;
		String workoutChoice;
		String chestWorkout;
		String continueAnswer;
		
		//Integers
		int age;
		
		//Double
		double weight = 0.0;
		double newWeight = 0.0;
		double chestWorkoutNumber = 0.0;
		double startingWeight = 0.0;
		double updatedWeight;
		double differenceWeight;
		
		//Welcome Statement for the user
		System.out.println("Welcome to your Fitness Tracker");
		
		System.out.println("Please fill out a user profile!");
		
		System.out.println("Enter your first name?");
		firstName = answer.nextLine();
		
		System.out.println("Enter your last name?");
		lastName = answer.nextLine();
		
		System.out.println("Enter your email:");
		email = answer.nextLine();
		
		System.out.println("Please enter your age: ");
		age = answer.nextInt();
		
		System.out.println("Enter your weight: ");
		weight = answer.nextDouble();
		answer.nextLine();
		
		//Creating User object
		User user1 = new User(firstName, lastName, age, weight, email);
		
		System.out.println("Your created a new profile! \n First Name: " + user1.getFirstName() + "\n Last Name: "+ user1.getLastName() + "\nEmail : " + user1.getEmail());
		
		//Asking the user what they want
		System.out.println("What part of your body are you working out today? \n 1. Chest \n 2. Back \n 3. Legs\n 4. Abs ");
		workoutChoice = answer.nextLine();
		
		
		
		
		if(workoutChoice.equalsIgnoreCase("chest")) {
			
				ChestWorkOut.chestWelcomeMessage(user1);
			
			
			
			
			//Output Chest workout
		}if(workoutChoice.equalsIgnoreCase("back")) {
			System.out.println("You chose the back workout");
			//Output Back workout
		}if(workoutChoice.equalsIgnoreCase("legs")) {
			System.out.println("You chose the leg workout");
			//Output Leg workout
		}if(workoutChoice.equalsIgnoreCase("arms")) {
			System.out.println("You choese the arms workout");
			//Output Arm workout
		}
		
	}

}
