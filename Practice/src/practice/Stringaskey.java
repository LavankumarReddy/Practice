package practice;

import java.util.List;
import java.util.ArrayList;

public class Stringaskey {

	
	public static void main(String args[]){
		List<Integer> l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		for(int i=0; i < l.size(); i++){
			System.out.println(l.get(i));
			l.add(i+10);
		/*	if(i>100){
				break;
			}*/
		}
		
	}
}
