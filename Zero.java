package groupszero;

import java.util.ArrayList;


public class Zero {
	String findzero(int[]array){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int index=0;
		int count=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==1){
				continue;
			}
			else if(array[i]==0){
				if(i<=(index+count-1)){
					continue;
				}
				else{
					count=0;
					index=i;
					count++;
					for(int j=1;j<(array.length-index);j++){
						if(array[i+j]==1){
							break;
						}
						else if(array[i+j]==0){
							count++;
							continue;
						}
					}
					list.add(count);
					list.add(index);
					continue;
				}
			}
		}
		String result="";
		for(int i=0;i<list.size();i=i+2){
			if(list.get(i)!=1){
				for(int j=0;j<list.get(i);j++){
					result=result+"0";
				}
				result=result+" occurs @ index ";
				result=result+list.get(i+1);
				result=result+"\n";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zero zero1=new Zero();
		int array[]={1, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		System.out.println(zero1.findzero(array));

	}

}
