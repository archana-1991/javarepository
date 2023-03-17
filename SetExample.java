package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("Lavanya");
		set1.add("Komal");
		set1.add("Mahi");
		set1.add("Komal");
		set1.add(null );
		System.out.println("The set of values are " +set1);
		//Sorted set
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("raju");
		set2.add("karim");
		set2.add("laddu");
		System.out.println(set2);
		
	//covert set into list
		ArrayList<String> list1=new ArrayList<String>(set1);
		System.out.println(list1);
		ArrayList<String> list2=new ArrayList<String>(set2);
		System.out.println(list2);
	
	}

}
