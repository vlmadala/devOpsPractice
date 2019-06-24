package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
	
	//New File In Git
	
	public static void main(String[] args) {
		//Initialize
		List<Integer> a0 = new ArrayList<>();
		List<Integer> a1;
		
		//2. cast an array to a vector
		
		Integer[] a= {1,2,3,4,5};
		a1= new ArrayList<>(Arrays.asList(a));
		
		//Make a copy  of array a 
		List<Integer> v2 = a1;
		List<Integer> v3 = new ArrayList<>(a1);
		
		//get  get Length
		System.out.println("The size of a1 : "+ a1.size() );
		
		// Access the first Element of ArrayList
		System.out.println("First Element : "+v2.get(0));
		
		//iterate the arrayList to get the elements
		
		for (int i=0;i<a1.size();i++) {
			System.out.print(" "+a1.get(i));     
		
		}
		
		System.out.println("Commit the changes");
	}

}
