package reverse;

import java.util.ArrayList;

public class Reverse {
	String makeReverse(String before){
		ArrayList<String> list=new ArrayList<String>();
		char ch[]=before.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(i>count||i==0){
				if(ch[i]!=' '){
					String word="";
					word=String.valueOf(ch[i]);
					for(int j=1;j<(ch.length-i);j++){
						if(ch[i+j]!=' '){
							word=word+String.valueOf(ch[i+j]);
							count=i+j;
						}
						else
								break;
					}
					list.add(word);
					// continue is not needed.
					continue;
				}
				// if is not needed
				if(ch[i]==' '){
					continue;
				}
			} // else is not needed
			else
				continue;
		}
		//output
		String after=list.get(list.size()-1);
		for(int i=(list.size()-2);i>=0;i--){
			after=after+" ";
			after=after+list.get(i);
			
		}
		return after;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r1=new Reverse();
		String before="I love the object oriented program course in NEU";
		System.out.println(r1.makeReverse(before));
		

	}

}
