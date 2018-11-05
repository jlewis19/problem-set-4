/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

import java.lang.Math;

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
		
		
		System.out.println(ps.surroundMe("<<>>", "abc"));
		System.out.println(ps.surroundMe("[[]]", "xyz"));
		System.out.println(ps.surroundMe("abc", "abc"));
		System.out.println(ps.surroundMe("(())", "qwerty"));
		System.out.println(ps.surroundMe(null, "abc"));
		System.out.println(ps.surroundMe("<<>>", null));
		
		System.out.println(ps.endsMeet("qwerty", 2));
		System.out.println(ps.endsMeet("basketball", 3));
		System.out.println(ps.endsMeet("qwerty", -1));
		System.out.println(ps.endsMeet("basketball", 0));
		System.out.println(ps.endsMeet("qwerty", 9));
		System.out.println(ps.endsMeet("programming", 2));
		System.out.println(ps.endsMeet(null, 1));
		
		System.out.println(ps.middleMan("candy"));
		System.out.println(ps.middleMan("programming"));
		System.out.println(ps.middleMan("even"));
		System.out.println(ps.middleMan(null));
		
		System.out.println(ps.doubleVision("qwerty"));
		System.out.println(ps.doubleVision("a"));
		System.out.println(ps.doubleVision(null));
		
		System.out.println(ps.centered("candy", "and"));
		System.out.println(ps.centered("programming", "ram"));
		System.out.println(ps.centered("qwerty", "qwe"));
		System.out.println(ps.centered("qwerty", "er"));
		System.out.println(ps.centered("qwerty", null));
		System.out.println(ps.centered(null, "abc"));
		System.out.println(ps.centered(null, null));
		
		System.out.println(ps.upOrDown(12.7, 'r'));
		System.out.println(ps.upOrDown(12.2, 'r'));
		System.out.println(ps.upOrDown(12.7, 'f'));
		System.out.println(ps.upOrDown(12.2, 'c'));
		System.out.println(ps.upOrDown(12.7, 'x'));
		
		System.out.println(ps.countMe("these are just some sample words", 'e'));
		System.out.println(ps.countMe(null, 'n'));
		System.out.println(ps.countMe("and some more sample words", '+'));
		System.out.println(ps.countMe("one more batch of sample words", 'h'));

		System.out.println(ps.isNotEqual("is not is not is"));
		System.out.println(ps.isNotEqual("is not is not is not"));
		System.out.println(ps.isNotEqual(null));

		System.out.println(ps.triplets("abbbccccd"));
		System.out.println(ps.triplets("aaabbbbccccc"));
		System.out.println(ps.triplets(null));
		System.out.println(ps.triplets("abbb1ccc"));
		System.out.println(ps.triplets("aaa bbb"));
    	
		System.out.println(ps.addMe("a123b456c789", true));
		System.out.println(ps.addMe("a123b456c789", false));
		System.out.println(ps.addMe(null, true));
		System.out.println(ps.addMe("abc 123 def", false));
		
		System.out.println(ps.isNotEqual("isn't knot isnnnot"));
	}
	
	
	public String surroundMe(String out, String in) {
		if (out == null || in == null || out.length() != 4 || in.length() != 3) {
			return null;
		}
		
		String surround = out.substring(0, 2) + in + out.substring(2, 4);
		return surround;
	}
	
	
	public String endsMeet(String str, int n) {
		if (str == null || str.length() < 1 || str.length() > 10 || n < 1 || n > str.length()) {
			return null;
		}
		
		String ends = str.substring(0, n) + str.substring(str.length() - n, str.length());
		return ends;
	}
	
	
	public String middleMan(String str) {
		if (str == null || str.length() % 2 == 0) {
			return null;
		}
		
		String middle = str.substring(str.length()/2 - 1, str.length()/2 + 2);
		return middle;
	}
	
	
	public String doubleVision(String str) {
		if (str == null) {
			return null;
		}
		
		String doubled = str.substring(0, 1) + str.substring(0, 1);
		
		for (int i = 1; i < str.length(); i++) {
			doubled += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return doubled;
	}
	
	public boolean centered(String str, String target) {
		if (str == null || target == null || target.length() != 3) {
			return false;
		}
		
		boolean center = false;
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals(target) && Math.abs(str.substring(0, i).length() - str.substring(i + 3, str.length()).length()) <= 1) {
				center = true;
				return center;
			}
		}
		return center;
	}
	
	
	public int upOrDown(double number, char operation) {
		if (operation != 'r' && operation != 'f' && operation != 'c') {
			return -1;
		}
		
		int newNumber = 0;
		
		if (operation == 'r') {
			newNumber = (int) Math.round(number);
		} else if (operation == 'f') {
			newNumber = (int) number;
		} else {
			newNumber = (int) number + 1;
		}
		
		return newNumber;
	}
	
	
	public int countMe(String text, char end) {
		if (text == null) {
	      		return -1;
	  	} else if ((end < 'A' || end > 'Z') && (end < 'a' || end > 'z')) {
	        		return -1;
	    	}
	    
	    	int count = 0;
	    
	    	for (int i = 0; i < text.length() - 1; i++) {
	        		if (text.charAt(i) == end && text.charAt(i + 1) == ' ') {
	           			count++;
	        		} 
	    	}
	    
	    	if (text.charAt(text.length() - 1) == end) {
	        		count++;
	   	}
	    
	    return count;
	}
	
	

	public boolean isNotEqual(String str) {
		if (str == null) {
		    return false;
		}
		
		int isCount = 0;
		int notCount = 0;
		
		for (int i = 0; i <= str.length() - 2; i++) {
		    if (str.substring(i, i + 2).equals("is")) {
		    	isCount++;
		    }
		}
		
		for (int i = 0; i <= str.length() - 3; i++) {
		    if (str.substring(i, i + 3).equals("not")) {
		    	notCount++;
		    }
		}
		
		if (isCount == notCount) {
		    return true;
		} else {
		    return false;
		}
	}
	

	public int triplets(String str) {
		if (str == null) {
		    return -1;
		}
		for (int i = 0; i < str.length() - 1; i++) {
		    if ((str.charAt(i) < 'A' || str.charAt(i) > 'Z') && (str.charAt(i) < 'a' || str.charAt(i) > 'z') || str.charAt(i) == ' ') {
	        		return -1;
	    	   }
		}
		
		int tripCount = 0;
		
		for (int i = 0; i <= str.length() - 3; i++) {
		    if (str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2) == 3 * str.charAt(i)) {
		        tripCount++;
		    }
		}
		
		return tripCount;
	}
	

	public int addMe(String str, boolean digits) {
	    if (str == null) {
	        return -1;
	    }
	    for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == ' ') {
	        	return -1;
	    	}
		}
		
		int count = 0;
        String bigNum = "0";
		
		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		        if (digits) {
		            count += Character.getNumericValue(str.charAt(i));  
		        } else {
		        	bigNum += str.charAt(i);
		        }
		    }
		    if (!digits) {
		    	if (i == str.length() - 1) {
		    		count += Integer.valueOf(bigNum);
			        bigNum = "0";
			    } else if (str.charAt(i + 1) < '0' || str.charAt(i + 1) > '9') {
			        count += Integer.valueOf(bigNum);
			        bigNum = "0";
			    }
		    }
		}
		
		return count;
	}
}