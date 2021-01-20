package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i)!="whole") {
				System.out.println(eggs.get(i));
				return i;
				
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters){
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				System.out.println(oysters.get(i));
				return i;
			}
		}
		return 0;
	}
	public static double findTallest(List<Double> peeps){
		double num = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>num) {
				num=peeps.get(i);
			}
		}
	//	for (int i = 0; i < peeps.size(); i++) {
	//	if(peeps.get(i)==num) {
	//		return i;
	//	}
	//.		}
		return num;
	}
	public static String findLongestWord(List<String> words) {
		int charlength= 0;
		int num=0;
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>charlength) {
				charlength = words.get(i).length();
				num=i;
			}
		}
		return words.get(num);
	}
	public static boolean containsSOS(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores (List<Double> scores) {
		 int n = scores.size(); 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (scores.get(j) > scores.get(j+1)) 
	                { 
	                    // swap arr[j+1] and arr[j] 
	                    Double temp = scores.get(j); 
	                    Double upTemp = scores.get(j+1);
	                    scores.set(j, upTemp);
	                    scores.set(j+1, temp);
	                  
	                    
	                }
			return scores; 
	}
	public static List<String> sortDNA(List <String> DNA){
		int n = DNA.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (DNA.get(j).length() > DNA.get(j+1).length())
                { 
                    // swap arr[j+1] and arr[j] 
                    String temp = DNA.get(j); 
                    String upTemp = DNA.get(j+1);
                    DNA.set(j, upTemp);
                    DNA.set(j+1, temp);
                  
                    
                }
		return DNA;
		
	}
	public static List<String> sortWords(List<String> words){
		String myStr1 = "bc";
		String myStr2 = "bb";
		System.out.println(myStr1.compareTo(myStr2));
		int n = words.size(); 
		 for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (words.get(j).compareTo(words.get(j+1)) == 1)
	                { 
	                    // swap arr[j+1] and arr[j] 
	                    String temp = words.get(j); 
	                    String upTemp = words.get(j+1);
	                    words.set(j, upTemp);
	                    words.set(j+1, temp);
	                  
	                    
	                }
		return words;
		
	}
}

