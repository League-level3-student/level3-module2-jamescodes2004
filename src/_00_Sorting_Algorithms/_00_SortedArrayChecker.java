package _00_Sorting_Algorithms;

import java.util.ArrayList;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static boolean intArraySorted(int[] array){
	int bigger  = array[0];

	for (int i = 1; i < array.length; i++) {
		
		if(array[i]>=bigger) {
			bigger = array[i];
		}
		else {
			return false;
			
			
		}
		
	}
	return true;
}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(double[] array) {
	double bigger = array[0];
	
	for (int i = 1; i < array.length; i++) {
		
		if(array[i]>=bigger) {
			bigger = array[i];
		}
		else {
			return false;
			
		}
		
	}
	return true;
}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] array) {
	char higher = array[0];
	
	for (int i = 1; i < array.length; i++) {
		int letterNum=alphabetToNum(array[i]);
		if(array[i]>=higher) {
			higher = array[i];
		}
		else {
			return false;
			
		}
		
	}
	return true;
}
static int alphabetToNum(char letter){
	if(letter=='a') {
		return 1;
	}
	if(letter=='b') {
		return 2;
	}
	if(letter=='c') {
		return 3;
	}
	if(letter=='d') {
		return 4;
	}
	if(letter=='e') {
		return 5;
	}
	if(letter=='f') {
		return 6;
	}
	if(letter=='g') {
		return 7;
	}
	if(letter=='h') {
		return 8;
	}
	if(letter=='i') {
		return 9;
	}
	if(letter=='j') {
		return 10;
	}
	if(letter=='k') {
		return 11;
	}
	if(letter=='l') {
		return 12;
	}
	if(letter=='m') {
		return 13;
	}
	if(letter=='n') {
		return 14;
	}
	if(letter=='o') {
		return 15;
	}
	if(letter=='p') {
		return 16;
	}
	if(letter=='q') {
		return 17;
	}
	if(letter=='r') {
		return 18;
	}
	if(letter=='s') {
		return 19;
	}
	if(letter=='t') {
		return 20;
	}
	if(letter=='u') {
		return 21;
	}
	if(letter=='v') {
		return 22;
	}
	if(letter=='w') {
		return 23;
	}
	if(letter=='x') {
		return 24;
	}
	if(letter=='y') {
		return 25;
	}
	if(letter=='z') {
		return 26;
	}
	return 0;
	
	
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static boolean stringArraySorted(String[] array) {
	char higher = array[0].charAt(0);
	int higherNum=alphabetToNum(higher);
	
	for (int i = 1; i < array.length; i++) {
		char letter = array[i].charAt(0);
		int letterNum=alphabetToNum(letter);
		if(letterNum>=higherNum) {
			higherNum = letterNum;
		}
		else {
			return false;
			
		}
		
	}
	return true;
}
}
