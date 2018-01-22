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
			
			
			//Shows the result of the choice
			System.out.println("You chose the chest workout today!!");
			
			//Giving the User the option to choose which workout they are doing that day
			
			//Will eventually change the choice options to a string
			System.out.println("Please pick a workout out:\n 1.Bench Press \n 2.Incline Press \n3. Decline Press");
			
			chestWorkout = chestAnswer.nextLine();
			if(chestWorkout.equalsIgnoreCase("bench press")) {
				
				//Getting current weight from the user
				System.out.println("Your current weight is: "+ user1.getWeight() + "\n Would you like to update your weight: yes or no");
				String updateAnswer = answer.nextLine();
				
				if(updateAnswer.equalsIgnoreCase("yes")) {
					
					System.out.println("Please enter your new weight");
					newWeight = answer.nextInt();
					
					user1.setWeight(newWeight);
					
				}
				
				
				System.out.println("Enter Bench Press Weight:");
				chestWorkoutNumber = chestAnswer.nextInt();
				
		
				//I will save the starting weight number always so they don't have to remember to enter weight every time
				System.out.println("You entered " +  chestWorkoutNumber + " !");
				
				System.out.println("Great Job! \n Did you want to add more Weight: yes or no ");
				answer.nextLine();
				continueAnswer = answer.nextLine();
				
				if(continueAnswer.equalsIgnoreCase("yes")) {
					System.out.println("Please enter weight: ");
					updatedWeight = answer.nextDouble();
					startingWeight = user1.getWeight();
					if(updatedWeight > startingWeight) {
						differenceWeight = updatedWeight - startingWeight;
						//find api based on geolocation that can tell what metric system is used in that location
						System.out.println("You went up " + differenceWeight + " pounds!");
					}else if(updatedWeight < startingWeight) {
						differenceWeight = updatedWeight = startingWeight;
						System.out.println("You went down " + differenceWeight + " pounds!\n" + "Don't give up!");
						
					}
				}
			}
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
