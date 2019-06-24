package arrayPractice;

public class ArrayExample1 {
	public static void main(String[] args) {
		 //1. Initialize Array 
		
		int[] a1 = new int[5] ;
		
		int[] a2 = {1,2,3,4,5,6};
		
		//2. Print the size of array 
		System.out.println("Size of array a1 :"+a1.length);
		System.out.println("Size of array a2 :"+a2.length);
		
		//3. Access the elementd of Array
		//System.out.println("First element of a1 :"+a1[0]);
		
		//4. Iterate through the array a1 
		for(int i=0;i<a1.length;i++) {
			
			a1[i]=i;
			System.out.print(" "+a1[i]);
		
		}
		System.out.println();
		
		System.out.println("Iterate array a2 using enhanced for loop");
		for(int item : a2) {
			System.out.print("  "+item);
		}
		
	}

}
