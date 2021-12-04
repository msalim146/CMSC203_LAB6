import java.util.Scanner;

/** 
* This class tests the Television class
*/
public class TelevisionDemo
	{
	public static void main(String[] args)
	{
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		//declare variables
		int station; //the user’s channel choice
		//declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		//turn the power on
		bigScreen.power();
		//display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
				bigScreen.getManufacturer() + " has been turned on.");
		//prompt the user for input and store into station
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		//change the channel on the television
		bigScreen.setChannel(station);
		//increase the volume of the television
		bigScreen.increaseVolume();
		//display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println("Too loud!! I am lowering the volume.");
		//decrease the volume of the television
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		bigScreen.decreaseVolume();
		//display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() +
				", Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		//HERE IS WHERE YOU DO TASK #5
		
		// Declare another object called .
	       Television television = new Television("Sharp", 19);

	       // use call to method to turn power on
	       television.power();
	      
	       //Use call to to methods to display screen size and manufacturer
	       System.out.println("A " + television.getScreenSize() + " inch "
	               + television.getManufacturer() + " has been turned on.");
	       
	       //Use call to turn volume down to 18
	       television.decreaseVolume();
	       television.decreaseVolume();

	       // Prompt the user for input and store into station
	       System.out.print("What channel do you want? ");
	       station = keyboard.nextInt();

	       // Change the channel to useer input
	       television.setChannel(station);
	       
	       //Display the channel and volume
	       System.out.println("Channel: " + television.getChannel() + " Volume: "
	               + television.getVolume());

	
	
		}
	}