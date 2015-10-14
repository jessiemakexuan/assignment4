import java.util.ArrayList;

public class Frbonacci {
	ArrayList<Integer> generate(int number){
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		for(int i=0;i<list.size();i++){
			int newnum=list.get(i)+list.get(i+1);
			if(newnum>=number){
				break;
			}
			else{
				list.add(newnum);
			}
		}
			
		return list;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frbonacci fnumb=new Frbonacci();
		System.out.println(fnumb.generate(145));

	}

}
