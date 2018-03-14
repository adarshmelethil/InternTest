/*
 * Copyright (c) 2018, Synopsys, Inc. All rights reserved worldwide.
 */

import java.util.List;
import java.util.ArrayList;

/**
 * In 1 hour do the following tasks.
 *
 * For each of the tasks below, write test cases that do a good job of testing the code.  Test cases should be written
 * in the InternQuestionsTest class located in src/test/java.
 */
public class InternQuestions {

    /**
     * Write a method that takes a list of numbers as an input and returns the pairs of numbers that add up to 10.
     * For example, given the input 1, 2, 3, 4, 5, 6, 7 the output would be (3,7), (4,6)
     * @param numbers a list of numbers
     * @return returns a list of the pairs of numbers that add up to 10 from the input numbers
     */
    public List<?> sumOfPairs(List<Integer> numbers) {
        List<Pair> pairs = new ArrayList();
        if (numbers == null) return pairs;
        for(int i = 0; i < numbers.size(); i++){
            for(int j = i+1; j < numbers.size(); j++){
                if (numbers.get(i).intValue() + numbers.get(j).intValue() == 10){
                    pairs.add(new Pair(numbers.get(i), numbers.get(j)));
                }
            }
        }
        return pairs;
    }

    /**
     * Write a method that tests whether a testString is a substring of the input string.
     *
     * NOTE: Do not use any special language built-ins
     *
     * @param input the input string to check
     * @param testString the test string
     * @return true if testString is a substring of input, false otherwise
     */
    public boolean isSubString(String input, String testString) {
        if (input == null || testString == null) return false;
        for(int i = 0; i < input.length(); i++){
            if(i+testString.length() > input.length()) break;
            if(input.substring(i, i+testString.length()).equals(testString)) return true;
        }
        return false;
    }

    /**
     * Write a method that returns true if the testString is a palindrome
     *
     * A palindrome is a string that is the same either forward or backwards.  For example, 'Anna' is a palindrome.
     * Note that the test for palindrome should be case insensitive.
     *
     * @param testString the string to test
     * @return true if the testString is a palindrome
     */
    public boolean isPalindrome(String testString) {
        if (testString == null || testString.length() <= 0) return false;

        testString = testString.toLowerCase();
        for(int i = 0, j = testString.length()-1; i < j; i++, j--){
            if(testString.charAt(i) != testString.charAt(j)) {
                System.out.println("--" + i + ", " + j);
                return false;
            }
        }
        return true;
    }

}
