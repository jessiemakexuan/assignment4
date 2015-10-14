package guess;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(100);
		Scanner in=new Scanner(System.in);
		System.out.println("Please guess a number between 1 and 100 - You have 5 chances to guess");
		boolean a=false;
		for(int count=1;count<6;count++){
			int guessnum=in.nextInt();
			if(guessnum==i){
				System.out.println("Congratulations! You've guessed it right and you guessed it in "+(count+1)+" chances..");
				a=true;
				break;
			}
			else if(guessnum<=i){
				System.out.println(guessnum+" is less than what I've guessed - You have "+(5-count)+" chances to guess");
				continue;
			}
			else if(guessnum>=i){
				System.out.println(guessnum+" is greater than what I've guessed - You have "+(5-count)+" chances to guess");
				continue;
			}
			in.close();
		}
		if(a==false){
			System.out.println("You lost");
		}

	}

}
