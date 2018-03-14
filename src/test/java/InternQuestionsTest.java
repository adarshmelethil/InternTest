/*
 * Copyright (c) 2018, Synopsys, Inc. All rights reserved worldwide.
 */

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertTrue;
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

    @Test 
    public void sumOfPairs_expectedValues(){
    	List<Integer> test_values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    	List<Pair> expected = Arrays.asList(
    			new Pair(3,7), 
    			new Pair(4,6)
    		);

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("Test example values", actual.equals(expected));
    	// assertThat(actual, samePropertyValuesAs(expected))
    }

    @Test 
    public void sumOfPairs_null(){
    	List<Integer> test_values = null;
    	List<Pair> expected = Arrays.asList();

    	List<?> actual = this.test_questions.sumOfPairs(test_values);
    	assertTrue("null value", actual.equals(expected));
    	// assertThat(actual, samePropertyValuesAs(expected))
    }
}