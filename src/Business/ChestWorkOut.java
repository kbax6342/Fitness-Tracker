package Business;

import java.util.Scanner;

public class ChestWorkOut { 
	

	public static String chestWorkout;
	public static Scanner chestAnswer = new Scanner(System.in);
	public static Scanner answer = new Scanner(System.in);
	public static double chestWorkoutNumber;
	public static double newWeight;
	public static String continueAnswer;
	
	
	public static double updatedWeight;
	public static double startingWeight;
	public static double differenceWeight;
	

	public static void chestWelcomeMessage(User user1) {
		
		//Shows the result of the choice
		System.out.println("You chose the chest workout today!!");
		
	
		//Will eventually change the choice options to a string
		System.out.println("Please pick a workout out:\n1.Bench Press \n2.Incline Press \n3. Decline Press");
		chestWorkout = chestAnswer.nextLine();
		
		if(chestWorkout.equalsIgnoreCase("bench press")) {
			
			//Getting current weight from the user
			System.out.println("Your current weight is: "+  user1.getWeight() + "\n Would you like to update your weight: yes or no");
			String updateAnswer = answer.nextLine();
			
			if(updateAnswer.equalsIgnoreCase("yes")) {
				
				System.out.println("Please enter your new weight");
				newWeight = answer.nextInt();
				
				user1.setWeight(newWeight);
				
			}
			
			
			System.out.println("Enter Bench Press Weight:");
			chestWorkoutNumber = chestAnswer.nextDouble();
			
	
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
		
		
	
	

}
}
