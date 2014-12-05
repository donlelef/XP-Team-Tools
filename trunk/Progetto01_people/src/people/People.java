package people;

import java.util.Arrays;

public class People {
	
	private Person[] people;
	
	public void setPeople(Person[] people) {
		this.people = people;
	}


	public void order() {
		Arrays.sort(people);
//		for (int i = 0; i < people.length; i++) {
//			for (int j = i+1; j < people.length; j++){ 
//				if(people[i].compareTo(people[j])>0){
//					Person tmp=people[i];
//					people[i]=people[j];
//					people[j]=tmp;
//				}
//			}
//		}
	}
}


