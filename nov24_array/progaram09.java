package nov24_array;

//Program-8
//===========
//Define a static Method that creates and returns array of numbers for a given integer as parameter.
//Write the method with following specifications
//Name of method : getIncreaseDecrease
//Arguments : One Integer 
//Return Type : int Array
//Return null if input is 1 or less.
//Return null if input is more than 20.
//Example :
//	input :  5
//	return array with values: {1,5,2,4,3}
//	
//	input : 8
//	return array with values: {1,8,2,7,3,6,4,5}
//	
//	input : -29
//	return: null
//Solution
//--------
 class Progaram09 {
	public static int[] getIncreaseDecrease(int input) {
		if(input<=1 || input > 20)
			return null;	
		int arr[] = new int[input];
		int last = input;
		int first = 1;
		int ctr = 0;
		do {
			if (ctr == input)
				break;
			if (ctr % 2 == 0)
				arr[ctr] = first++;
			else
				arr[ctr] = last--;
			ctr++;
		} while (true);
		
		return arr;
	}
	public static void main(String[] args) {
		for (int i : getIncreaseDecrease(11)) {//a[]
			System.out.print(i + ",");
		}
	}
}



