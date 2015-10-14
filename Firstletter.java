package firstletter;

import java.util.ArrayList;

public class Firstletter {
	String largerletter(String before){
		ArrayList<String> list=new ArrayList<String>();
		char ch[]=before.toCharArray();
		int count=0;
		//the first letter in a sentence should be upper
		ch[0]-=32;
		String fword=String.valueOf(ch[0]);
		
		for(int i=1;i<ch.length;i++){
			if(i>count||i==0){
				if(ch[i]!=' '){
					String word="";
					if(i==1){
						word=fword;
					}
					else{
					    ch[i]-=32;
					}
					word=word+String.valueOf(ch[i]);
					for(int j=1;j<(ch.length-i);j++){
						if(ch[i+j]!=' '){
							word=word+String.valueOf(ch[i+j]);
							count=i+j;
						}
						else
								break;
						}
					list.add(word);
					continue;
				}
				if(ch[i]==' '){
					if(i==1){
						list.add(fword);
					}
					continue;
				}
			}
			else
				continue;
		}
		//output
		String after=list.get(0);
		for(int i=1;i<list.size();i++){
			after=after+" ";
			after=after+list.get(i);
		}
		return after;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstletter f=new Firstletter();
		String before="we love seattle and will live here for a long time.";
		System.out.println(f.largerletter(before));

	}

}
