package week_03_CA;

import java.lang.reflect.Array;

public class Arrays_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,56,64,2,8,28,93};
								
		System.out.println(ages[ages.length -1]);	
		//a.Programmatically subtract the value of the first element in the array from the value in the last 
			//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length -1]-ages[0]);
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
		
		greet1 ("Sockzehigh");
		
		
		//7.Write a method that takes a String = word, and an int = n, as arguments and returns the word
		//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method
		//to return “HelloHelloHello”).
		
		String word1 = multiplyString("Hello",3);
		System.out.println(word1);

		//8.Write a method that takes two Strings, firstName and lastName, and returns a full name
		//(the full name should be the first and the last name as a String separated by a space).
		
		String firstName = "Judy";
		String lastName = "Hops";
		System.out.println(firstName + " " + lastName);
		System.out.println(fullName(firstName, lastName));
			
		
		//9.Write a method that takes an array of int and returns true if the sum of all the ints
		//in the array is greater than 100.
		
		System.out.println(isGreaterThan100(ages));
		
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		
		System.out.println(calculateAverage(ages));
		
		//11.Write a method that takes two arrays of double and returns true if the average of the elements
		//in the first array is greater than the average of the elements in the second array
		
		double[] numE = {2,4,6,8};
		double[] numO = {9,11,13};
		System.out.println(averageElements(numE,numO));
		
				
		//12.Write a method called willBuyDrink that takes a boolean isHotOutside,
		//and a double moneyInPocket, and returns true if it is hot outside
		//and if moneyInPocket is greater than 10.50.
		
		//13.Create a method of your own that solves a problem. In comments, write what the method does
		//and why you created it.
		
		double[] sevenDays = {74.5,68.5,89.3,92.2,101.5,90.6};
		double[] waterUsage = {5.1, 7.2,15.3,20.4,3.0};
		System.out.println(availableWater(sevenDays,waterUsage));
		
		//during the early spring and dependent upon the crop type water is critical for a substantial yield.
		//when the temperature is cooler the crop does not require as much water and conservation is key when 
		//irrigating.   if water usage is less in gallons to a less demanding crop then water can be allocated 
		//to another high demanding crop that does require many gallons of water.
		//over time available Water can be adjusted based off the condition  of weather type.
		//exact measure of water and temperature would require a precise variable known as double instead of an
		//integer. integers round a number to the next whole number and conservation of water in this case would
		// be in percentage of a whole number and two decimal places such as .25, .5, and/or .75 as an example.
		
		boolean isHotOutside = true;
		double moneyInPocket = 20.00; //if 10.00 on console will be false.
		System.out.println(willBuyDrink (isHotOutside, moneyInPocket));
	
		} //End of Main

	public static String fullName(String String1, String String2) {
		return String1 + " " + String2; 
	}
	
		public static String multiplyString(String word1, int n) {  
		String result = "";
		for(int i = 0; i < n; i++) {
			result += word1;
		}
				return result;
				
			}
		
		private static void greet1(String string) {
		System.out.println("hello " + " " + string);
		
		}

		//9. method
		public static boolean isGreaterThan100(int []ages2) {
			int sum = 0; 
			for (int age: ages2) {
				sum += age;
				System.out.println(age);
				System.out.println(sum);
				
			}
			if (sum >100) {
			return true;
			}else {
			return false;
			}
		
											
		}

		//10. method
		public static double calculateAverage(int[] ages) {
			double sum = 0;
			for (double numbers : ages) {
				sum+= numbers;
			}
					return sum /ages.length;
		}

	//11. method
		
//		static int[] numE = {2,4,6,8};
//		static int[] numO = {9,11,13};
//				
//		public static double averageElements (double [] arrayOne) {
//			double sum = 0;
//			for (double array1 : numE) {
//				sum +=array1; 
//			}
//			return sum / numE.length;
//			
//		}
//			
//			public static double averageElements1 (double [] arrayTwo) {
//				double sum1 = 0;
//				for (double array2 : numO) {
//					sum1 +=array2; 
//				}
//				return sum1 / numO.length;
//				
//				}
				
		
		
		public static boolean averageElements (double [] arrayOne, double [] arrayTwo) {
			double sum = 0; 
			double sum1 = 0;
			for (double num : arrayOne) {
				sum+= num;
				System.out.println(num);
				
			}
			
			for (double num : arrayTwo) {
				sum1 += num ;
				System.out.println(num);
				
			}
			
			//double totalSum = sum + sum1;
			//double totalLength = arrayOne.length + arrayTwo.length;
			double average = sum/arrayOne.length;
			double average2 = sum1/arrayTwo.length;
			
			return (average > average2);
		}
		
	
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else { 
				return false; 
				}											
			}
		
			
	//13. method
			
			public static double availableWater(double [] sevenDays, double [] waterUsage) {
				double sum = 0;
				double sum1 = 0; {
				for (double num : sevenDays) {
					sum += num;
					}
				for (double num : waterUsage) {
					sum1 += num;
					
				}
				double totalSum = sum + sum1;
				double totalLength = sevenDays.length + waterUsage.length;
				double average =totalSum/totalLength;
				return average; 
								
					//if conditional will work!
			}
			
//			if dayIsBelow50(int sevenDays > 50);
//			return true;
//			} else {
//				return (do not water);
				
			}
					
		}
			
			
			
			
			

//HHHH! i think i did it!	
				
			
		
	





	
	




