import java.util.Scanner;
import java.lang.Math;
public class RandyGameDo {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100) +1 ;
		Scanner input = new Scanner(System.in);
		int player;
		do {
			System.out.println("Guess a number(1-100): ");
			player =input.nextInt();
			if (player == num) {//==in boolean
				System.out.println("Congrats.You're Inevitable.");
			} else if(player<num){
				System.out.println("Nope,Try somthing bigger");
			}
			else {
				System.out.println("Nope,Try Something Smaller");
			} 
		}while(player != num);
			
		}
		
	
		// TODO Auto-generated method stub

	}


