import java.util.Random;
import java.util.Scanner;

public class CowsandBulls {
	int[] getrandom(){
		Random randomGenerator = new Random();
		int num = randomGenerator.nextInt(9000)+1000;
		int numList[]=new int[4];
		for(int i=3;i>=0;i--){
			numList[i]=num%10;
			num=num/10;
		}
		return numList;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CowsandBulls c=new CowsandBulls();
		int numList[]=c.getrandom();
		//GAME RULE: The digits must be all different.
		Loop:
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				if(numList[j]==numList[i]){
					numList=c.getrandom();
					continue Loop;
				}
			}
			
		}
//		for(int i=0;i<4;i++){
//			System.out.print(numList[i]);
//		}
		int bull=0;
		int cow=0;
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("Guess a 4-digit number,each digit should be different");
			int guess=in.nextInt();
			int guessList[]=new int[4];
			for(int i=3;i>=0;i--){
				guessList[i]=guess%10;
				guess=guess/10;
			}
			bull=0;
			cow=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(guessList[j]==numList[i]){
						if(i==j){
							bull++;
						}
						else if(i!=j){
							cow++;
						}
					}
				}
				continue;
			}
			System.out.println(cow+" cow "+bull+" bull");
		}while(bull!=4&&cow!=0);
		in.close();
		
	}

}
