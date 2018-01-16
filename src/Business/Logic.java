package Business;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		Scanner answer = new Scanner(System.in);
		
		String workoutChoice;
		int chestChoice;
		int startingWeight;
		int updatedWeight;
		int differenceWeight;
		String continueAnswer;
		
		
		System.out.println("Welcome to your Fitness Tracker");
		
		System.out.println("What part of your body are you working out today?");
		workoutChoice = answer.nextLine();
		
		if(workoutChoice.equalsIgnoreCase("chest")) {
			//Shows the result of the choice
			System.out.println("You chose the chest workout");
			
			//Giving the User the option to choose which workout they are doing that day
			//Will eventually change the choice options to a string
			System.out.println("Please pick a workout out:\n" + "1.Bench Press \n2.Incline Press \n3. Decline Press");
			chestChoice = answer.nextInt();
			if(chestChoice == 1) {
				System.out.println("Please enter starting weight: ");
				startingWeight = answer.nextInt();
				//I will save the starting weight number always so they don't have to remember to enter weight every time
				System.out.println("You entered " + startingWeight + " ! \n Would you like to add more weight?");
				answer.nextLine();
				continueAnswer = answer.nextLine();
				
				if(continueAnswer.equalsIgnoreCase("yes")) {
					System.out.println("Please enter weight: ");
					updatedWeight = answer.nextInt();
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
