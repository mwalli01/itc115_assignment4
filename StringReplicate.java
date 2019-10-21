package assignments;

//*******************************************************************


//stringReplicate
//
//this class method takes a string and replicates it X number of times, determined by parameter "number"
//By: m.w.
//10/19/2019
//*******************************************************************


public class StringReplicate {
	
	public static String repl(String word,int number ) {
		//initialize local variable to store concatenated string
		String addTo = "";
		//concatenate string equal to number of times in parameter
		for(int i = 0; i < number; i++) {				
			//add replicated string to concatenation 
			addTo = addTo + word;
		}
		//print out the completed concatenation, but also return the string for unit testing purposes
		System.out.print(addTo);
		return addTo;
		}
}