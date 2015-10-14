package pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		in.close();
		int wholenum=(row*(row+1))/2;
		int numlist[]=new int[wholenum];
		//create a array{1,2,3,4,5,6...wholenum}
		int a =1;
		for(int i=0;i<numlist.length;i++){
			numlist[i]=a;
			a++;
		}
		//output
		for(int n=1;n<=row;n++){
			for(int i=0;i<row-n;i++){
				System.out.printf("%-3s"," ");//row<45
			}
			for(int i=(n*(n-1)/2);i<((n*(n-1)/2)+n);i++){
				System.out.printf("%-3s",numlist[i]);
				if(i<((n*(n-1)/2)+n-1)){
					System.out.printf("%-3s"," ");
				}
			}
			for(int i=0;i<row-n;i++){
				System.out.printf("%-3s"," ");
			}
			System.out.print("\n");
		}

	}

}
