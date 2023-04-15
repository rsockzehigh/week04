package week_03_CA;

import java.lang.reflect.Array;

public class Arrays_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,56,64,2,8,28,93};
								
		System.out.println(ages [7]);	
		//a.Programmatically subtract the value of the first element in the array from the value in the last 
			//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages [8] - ages[0]);
		//b.add a new age to your array and repeat the step above to ensure it is dynamic
		//(works for arrays of different lengths).
		int num = ages.length;
		System.out.println(num);
		//c. c.	Use a loop to iterate through the array and calculate the average age.
		//Print the result to the console.
		
		int sum = 0;
		for (int aveAge : ages) {
			sum+= aveAge;
		}
		int aveAge = sum / ages.length;
		System.out.println(aveAge);
		//2. Create an array of String called names that contains the following values:
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//a.Use a loop to iterate through the array and calculate the average number of letters per name.
		// Print the result to the console.	
		int sum1 = 0;
		for (String aveNumLetters : names) {
			sum1 += aveNumLetters.length();
			}
		System.out.println(sum1 / names.length);
		//b.Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
		//String arrayAgain = ("Sam,"+ " "+ "Tommy,"+ " "+ "Tim,"+ " "+ "Sally,"+ " "+  "Buck,"+ " "+  "Bob.");
		//System.out.println(arrayAgain);
		String sumOfName = "";
		for (String string1 : names) {
			sumOfName += string1 + " ";
			}
		System.out.println(sumOfName);
		//3.How do you access the last element of any array?
		System.out.println(ages [8]);
		//4.How do you access the first element of any array?
		System.out.println(ages [0]);
		//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//created names array and add the length of each name to the nameLengths array.
		int []namesLengths = new int [names.length];
		for(int i = 0; i < names.length; i++) {
			namesLengths[i] = names[i].length();
			}
		for(int x : namesLengths) {
			System.out.println(x);
		}
		
		//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
		//in the array. Print the result to the console.
		int []sumElements = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			sumElements [i] = names[1].length();
			}
		for(int names1 : sumElements) {
			sum+=names1;
			System.out.println(names1);
		}
		
		greet1 ("Promineo");
		
		
		//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word
		//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method
		//to return “HelloHelloHello”).

		//8.Write a method that takes two Strings, firstName and lastName, and returns a full name
		//(the full name should be the first and the last name as a String separated by a space).
		
		//9.Write a method that takes an array of int and returns true if the sum of all the ints
		//in the array is greater than 100.
		
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		
		//11.Write a method that takes two arrays of double and returns true if the average of the elements
		//in the first array is greater than the average of the elements in the second array
		
		//12.Write a method called willBuyDrink that takes a boolean isHotOutside,
		//and a double moneyInPocket, and returns true if it is hot outside
		//and if moneyInPocket is greater than 10.50.
		
		//13.Create a method of your own that solves a problem. In comments, write what the method does
		//and why you created it.
		
		boolean isHotOutside = true;
		double moneyInPocket = 20.00; //if 10.00 on console will be false.
		System.out.println(willBuyDrink (isHotOutside, moneyInPocket));
	
		} //End of Main
	

			



		private static void greet1(String string) {
		System.out.println(greet1);
		
		//here i thought this one would be easy!!!
	}






		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else { 
				return false;
			
			
			
			
			
			}
			
			
	
		
		}

//HHHH!		
				
			}
		
	





	
	




