package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class FinalExamTests {

	@Test
	void intToRomanTest1() {
		assertEquals("LVIII", FinalExam.intToRoman(58));
	}
	
	@Test
	void intToRomanTest2() {
		assertEquals("MCMXCIV", FinalExam.intToRoman(1994));
	}
	
	@Test
	void letterCombinationsTest1() {
		ArrayList<String> actualList = FinalExam.letterCombinations("23");
		String[] actual = actualList.toArray(new String[actualList.size()]);
	
		String[] result = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
		
		Arrays.sort(actual);
		Arrays.sort(result);
		
		assertArrayEquals(result, actual);
	}
	
	@Test
	void letterCombinationsTest2() {
		ArrayList<String> actualList = FinalExam.letterCombinations("78");
		String[] actual = actualList.toArray(new String[actualList.size()]);
		
		String[] result = {"pt", "pu", "pv", "qt", "qu", "qv", "rt", "ru", "rv",
				"st", "su", "sv"};
		
		Arrays.sort(actual);
		Arrays.sort(result);
		
		assertArrayEquals(result, actual);
	}
}