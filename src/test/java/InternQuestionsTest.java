/*
 * Copyright (c) 2018, Synopsys, Inc. All rights reserved worldwide.
 */

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;


public class InternQuestionsTest {

	private InternQuestions test_questions;

    // Tests should go here
    // @BeforeClass 
    public static void setupBeforeClass() throws Exception{}

    @Before 
    public void setup(){
    	test_questions = new InternQuestions();
    }

    // sumOfPairs START
    @Test 
    public void sumOfPairs_exampleValues(){
    	List<Integer> test_values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    	List<Pair> expected = Arrays.asList(
    			new Pair(3,7), 
    			new Pair(4,6)
    		);
    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("Test example values", actual.equals(expected));
    }
    @Test 
    public void sumOfPairs_null(){
    	List<Integer> test_values = null;
    	List<Pair> expected = Arrays.asList();

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("null value", actual.equals(expected));
    }
    @Test 
    public void sumOfPairs_emptyList(){
    	List<Integer> test_values = Arrays.asList();
    	List<Pair> expected = Arrays.asList();

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("empty list", actual.equals(expected));
    }
	@Test 
    public void sumOfPairs_repeatedValues(){
    	List<Integer> test_values = Arrays.asList(5,5,5);
    	List<Pair> expected = Arrays.asList(
    			new Pair(5,5),
    			new Pair(5,5),
    			new Pair(5,5)
    		);

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("repeated values", actual.equals(expected));
    }
    @Test 
    public void sumOfPairs_noCombination(){
    	List<Integer> test_values = Arrays.asList(2,4,5);
    	List<Pair> expected = Arrays.asList();

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("no pairs", actual.equals(expected));
    }
    // sumOfPairs END

    // isSubString START
	@Test 
    public void isSubString_testPositive(){
    	String test_input = "Test String";
    	String test_subInput = "st Str";

    	assertTrue("positive result", this.test_questions.isSubString(test_input, test_subInput));
    }
	@Test 
    public void isSubString_testNegative(){
    	String test_input = "Test String";
    	String test_subInput = "stStr";

    	assertFalse("negative result", this.test_questions.isSubString(test_input, test_subInput));
    }
	@Test 
    public void isSubString_testNullInput(){
    	String test_input = null;
    	String test_subInput = "stStr";

    	assertFalse("test null inputs", this.test_questions.isSubString(test_input, test_subInput));
    }
	@Test 
    public void isSubString_testNullSubInput(){
    	String test_input = "Test String";
    	String test_subInput = null;

    	assertFalse("null substring input", this.test_questions.isSubString(test_input, test_subInput));
    }
    @Test 
    public void isSubString_testEmptyInput(){
    	String test_input = "";
    	String test_subInput = "st Str";

    	assertFalse("empty input string", this.test_questions.isSubString(test_input, test_subInput));
    }
    @Test 
    public void isSubString_testEmptySubInput(){
    	String test_input = "Test String";
    	String test_subInput = "";

    	assertTrue("empty substring input", this.test_questions.isSubString(test_input, test_subInput));
    }
    // isSubString END


    // isPalindrome Start
    @Test 
    public void isPalindrome_example(){
    	String test_input = "anna";
    	assertTrue("example string", this.test_questions.isPalindrome(test_input));
    }
    @Test 
    public void isPalindrome_camelCase(){
    	String test_input = "aNnA";
    	assertTrue("Should be case insensitive", this.test_questions.isPalindrome(test_input));
    }
    @Test 
    public void isPalindrome_notPalin(){
    	String test_input = "asfasd";
    	assertFalse("non palindrome", this.test_questions.isPalindrome(test_input));
    }
    @Test 
    public void isPalindrome_emptyString(){
    	String test_input = "";
    	assertFalse("empty string", this.test_questions.isPalindrome(test_input));
    }
    @Test
    public void isPalindrome_nullInput(){
    	String test_input = null;
    	assertFalse("no string is not a palindrome", this.test_questions.isPalindrome(test_input));
    }
    // isPalindrome END

}