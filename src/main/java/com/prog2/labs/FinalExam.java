package com.prog2.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adinashby
 *
 */

public class FinalExam {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
            
            System.out.print(FinalExam.intToRoman(58));

	}

	/**
	 * Please refer to the README file for question(s) description
	 */
	
    public static String intToRoman(int num) {
      
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumeral = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
    for (int i = 0; i < values.length; i++) {
        while (num >= values[i]) {
            num -= values[i];
            sb.append(romanNumeral[i]);
        
        
            
        }
    }
    return sb.toString();
}
       private static final String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz","", "", "tuv", "wxyz"};

    
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<>();

        
          if (digits == null || digits.isEmpty()) {
            return result;
        }

        
        generateCombinations(digits, 0, "", result);

        
        return result;
    }  
     
    private void generateCombinations(String digits, int index, String current, List<String> result) {
        
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        
        String letters = LETTERS[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
           
            generateCombinations(digits, index + 1, current + c, result);
        }
    }
}