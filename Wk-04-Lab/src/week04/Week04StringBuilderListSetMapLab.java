//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?: A StringBuilder is mutable. A String is not.
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
System.out.println("01----------");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i + "-");
		} sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length

		List<String> list = new ArrayList<String>();
		list.add("Philodendron");
		list.add("Monstera");
		list.add("Anthurium");
		list.add("Syngonium");
		list.add("Hoya");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
System.out.println();
System.out.println("03----------");

		System.out.println(findSmallest(list));
		System.out.println(findSmaller(list));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
System.out.println();
System.out.println("04----------");

		System.out.println(makeSwitch(list));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
System.out.println();
System.out.println("05----------");

		System.out.println(isConcatenated(list));
		System.out.println(isConcatenated2(list));
		System.out.println(isConcatenated3(list));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
System.out.println();
System.out.println("06----------");

		System.out.println(findElement(list,"ium"));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
System.out.println();
System.out.println("07----------");

		List<Integer> x = Arrays.asList(1,2,3,4,5,6,7,9,10,15);
		System.out.println(divisibleBy(x));
		System.out.println(divisibleBy2(x));
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
System.out.println();
System.out.println("08----------");

		System.out.println(count(list));
		
		// 9. Create a set of strings and add 5 values

		Set<String> values = new HashSet<String>();
		values.add("Philodendron");
		values.add("Monstera");
		values.add("Anthurium");
		values.add("Syngonium");
		values.add("Hoya");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
System.out.println();
System.out.println("10----------");

		System.out.println(isPresent(values,'H'));
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
System.out.println();
System.out.println("11----------");

		System.out.println(createList(values));

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
System.out.println();
System.out.println("12----------");

		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1); nums.add(2); nums.add(3); nums.add(4); nums.add(5); nums.add(6); nums.add(7); nums.add(8); nums.add(9); nums.add(0);
		System.out.println(callEvens(nums));
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		Map<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("Fertilizer","Plant food");
		dictionary.put("Media", "The substance a plant grows in");
		dictionary.put("Cachepot", "A decorative cover pot for houseplants");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
System.out.println();
System.out.println("14----------");

		System.out.println(isDefinition(dictionary,"Nope"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
System.out.println();
System.out.println("15----------");

		System.out.println(countFirstLetter(list));

	}
	
	
	// Method 15:
	
	public static Map<Character,Integer> countFirstLetter(List<String> list) {
		Map<Character,Integer> count = new HashMap<Character,Integer>();
		for (String str : list) {
			char zero = str.charAt(0);
			
			if (count.containsKey(zero)) {
				count.put(zero,count.get(zero)+1);
			} else {
				count.put(zero, 1);
			}
		} return count;
	}
	
	// Method 14:
	
	public static String isDefinition(Map<String,String> dictionary,String word) {
		if (dictionary.containsKey(word)) {
			return word + ": " + dictionary.get(word);
		} return word + ": [Undefined]";
	}
	
	// Method 12:
	
	public static Set<Integer> callEvens(Set<Integer> nums) {
		Set<Integer> evens = new HashSet<Integer>();
		for (int num : nums) {
			if (num%2==0) {
				evens.add(num);
			}
		} return evens;
	}
	
	// Method 11:
	
	public static List<String> createList(Set<String> x) {
		List<String> list = new ArrayList<String>();
		for (String str : x) {
			list.add(str);
		} return list;
	}

	// Method 10:
	
	public static Set<String> isPresent(Set<String> x, char a) {
		Set<String> included = new HashSet<String>();
		for (String y : x) {
			if (y.charAt(0)==a) {
			included.add(y);
			}
		} return included;
	}
	
	// Method 8:
	
	public static List<Integer> count(List<String> x) {
		List<Integer> count = new ArrayList<Integer>();
		for (String str : x) {
			count.add(str.length());
		} return count;
	}
	
	// Method 7:
	
	public static List<List<Integer>> divisibleBy(List<Integer> list) {
		List<Integer> divBy2 = new ArrayList<Integer>();
		List<Integer> divBy3 = new ArrayList<Integer>();
		List<Integer> divBy5 = new ArrayList<Integer>();
		List<Integer> notDiv = new ArrayList<Integer>();
		List<List<Integer>> consolidated = new ArrayList<List<Integer>>();
		
		for (int elem : list) {
			if (elem%2==0) {
				divBy2.add(elem);
			}
			if (elem%3==0) {
				divBy3.add(elem);
			}
			if (elem%5==0) {
				divBy5.add(elem);
			}
			if (elem%2!=0 && elem%3!=0 && elem%5!=0) {
				notDiv.add(elem);
			}
		}
		consolidated.add(divBy2);
		consolidated.add(divBy3);
		consolidated.add(divBy5);
		consolidated.add(notDiv);
		return consolidated;
		
	}
	
	public static List<List<Integer>> divisibleBy2(List<Integer> list) {
		List<List<Integer>> consolidated = new ArrayList<List<Integer>>();
		consolidated.add(new ArrayList<Integer>());
		consolidated.add(new ArrayList<Integer>());
		consolidated.add(new ArrayList<Integer>());
		consolidated.add(new ArrayList<Integer>());
		
		for (int elem : list) {
			if (elem%2==0) {
				consolidated.get(0).add(elem);
			}
			if (elem%3==0) {
				consolidated.get(1).add(elem);
			}
			if (elem%5==0) {
				consolidated.get(2).add(elem);
			}
			if (elem%2!=0 && elem%3!=0 && elem%5!=0) {
				consolidated.get(3).add(elem);
			}
		} return consolidated;
	}
	
	// Method 6:
	
	public static List<String> findElement (List<String> list, String str) {
		List<String> result = new ArrayList<String>();
		for (String element : list) {
			if (element.contains(str)) {
			result.add(element);
			}
		} return result;
	}
	
	// Method 5:
	
	public static String isConcatenated(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String element : list) {
			sb.append(element + ",");
		} sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	
	public static String isConcatenated2(List<String> list) {
		String concatWord = "";
		for (String element : list) {
			if (element != list.get(list.size()-1)) {
				concatWord += element + ",";
			} else {
				concatWord += element;
			}
		} return concatWord;
	}
	
	public static String isConcatenated3(List<String> list) {
		String concatWord = "";
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size()-1) {
				concatWord += list.get(i) + ",";
			} else {
				concatWord +=list.get(i);
			}
		} return concatWord;
	}
	
	// Method 4:
	
	public static List<String> makeSwitch(List<String> list) {
		String first = list.get(list.size() - 1);
		String last = list.get(0);
		list.set(0, first);
		list.set(list.size()-1, last);
		return list;
	}
	
	// Method 3:
	
	public static String findSmallest(List<String> list) {
		String smallest = list.get(0);
		for (String word : list) {
			if (word.length() < smallest.length()) {
				smallest = word;
			}
		} return smallest;
	}

	public static String findSmaller(List<String> list) {
		String smallest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i)).length() < smallest.length()) {
				smallest = list.get(i);
			}
		} return smallest;
	}
}