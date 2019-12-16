import java.util.ArrayList;


public class Driver {

	
	public static void main(String[] args) {
		//note on ArrayList data structure!
		
		//1D arrays
		int[] nums = {1, 2, 3, 4, 5};
		
		//to resize nums
		//we have to create a bigger array and copy over old data
		int[] numsBigger = new int[10];
		
		int i = 0;
		//for every number in the array called nums
		for(int number: nums){
			//loop visits every number in nums
			//and temporarily holds in number
			numsBigger[i] = number;
			i++;
			//not convenient when you need an indexing variable
		}
		
		//Start of ArrayList notes!
		//ArrayLists hold Objects
		//ints booleans and doubles are primitive types
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//Adding elements (objects)
		myList.add(0); //adds to next open spot starting at index 0
		myList.add(7);
		myList.add(9);
		myList.add(3);
		myList.add(20);
		
		//grabbing the size of the list
		System.out.println(myList.size()); //uses "size" instead of "length"
		System.out.println(myList);
		
		//SECOND version of add!
		// What if you want to add at a specific location?!
		myList.add(0, -1); //first number is location; second is element
		System.out.println(myList); //all elements shift to the right
		
		myList.add(2, 4); //insert a 4 at index 2
		System.out.println(myList);
		
		//REPLACING elements
		myList.set(0, 8);
		System.out.println(myList);
		
		//REMOVING elements
		myList.remove(myList.size()-1);
		System.out.println(myList);
		System.out.println(myList.size()); //uses "size" instead of "length"
		
		//create an ArrayList of Donuts called holes
		//ArrayList<Type> name = new ArrayList<Type>();
		
		ArrayList<Donut> holes = new ArrayList<Donut>();
		
		//add 10 donuts that are 200 calories or less
		//add 2 donuts that are 600 calories or more
		for(int x = 0; x < 10; x++){
			holes.add( new Donut(200));
		}
		
		for(int x = 0; x < 2; x++){
			holes.add( new Donut(3000));
		}
		
		//reading from the list!!!
		System.out.println(holes.get(10));
		
		//print out all of the donuts using a LoOp
		//must use an Enhanced for loop!
		
		//for each Donut in holes
		for(Donut curr: holes){
			System.out.println(curr);
		}
		
	}

}

//simple class type
class Donut{ //exclude the public keyword in the class definition 
					 //if it exists in the same as another
	
	private int calories;
	
	public Donut(int numCalories){
		calories = numCalories;
	}
	
	public int getCalories(){
		return calories;
	}
	
	//this method is invoked when this object is printed
	//or passed to print or println
	public String toString(){
		
		if(calories <= 200){
			return "yey";
		}else{
			return "gross";
		}
		
	}
	  
	
}

