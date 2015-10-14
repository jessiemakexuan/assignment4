package moreletter;

import java.util.ArrayList;

public class Moreletter {
	String countLetter(String before){
		ArrayList<String> list=new ArrayList<String>();
		char ch[]=before.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(i>count||i==0){
				if((65<=ch[i]&&ch[i]<=90)||(97<=ch[i]&&ch[i]<=122)){
					int letternumber=1;
					String word=String.valueOf(ch[i]);
					for(int j=1;j<(ch.length-i);j++){
						if(((65<=ch[i+j]&&ch[i+j]<=90)||(97<=ch[i+j]&&ch[i+j]<=122))){
							word=word+String.valueOf(ch[i+j]);
							count=i+j;
							letternumber++;
						}
						else
								break;
					}
					if(letternumber>=4){
						list.add(word);
					}
					continue;
				}
				else{
					continue;
				}
			}
			else
				continue;
		}
		//output
		String after=list.get(0);
		for(int i=1;i<list.size();i++){
			after=after+"\n";
			after=after+list.get(i);
			
		}
		return after;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moreletter m=new Moreletter();
		String before="Java is a cool OOP. It doesnt have multiple inheritance";
		System.out.println(m.countLetter(before));

	}

}
