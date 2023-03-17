package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistExample {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"Gita","cherry","prasad","Ram"};
		System.out.println("the second name of arraylist is " + names[1]);
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Gita");
		list1.add("cherry");
		list1.add("prasad");
		list1.add("Ram");
		list1.add("Ram");
		list1.add(" ");
		
		System.out.println("The list is " + list1);
		System.out.println("the size of list is " + list1.size());
		System.out.println("First name in the list is " + list1.get(0));
		System.out.println("last name in the list is " + list1.get(list1.size()-1));
		
		list1.set(1,"Mike");
		System.out.println("the list after updating Cherry is" +list1);
		
		list1.remove(2);
		System.out.println("the list after deleting prasad " + list1);

		for(int i=0;i<list1.size();i++) {
			System.out.println("Element name "+ list1.get(i));
			
	}
		for(String value:list1) {
			System.out.println("Element name "+ value);
		}
		
		Iterator <String> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list1);
		System.out.println("After sorting the values " + list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("After sorting in descending order" + list1);
		//Collections.reverse(list1);
		//System.out.println("After Reverse order values " + list1);
		
	}


}
