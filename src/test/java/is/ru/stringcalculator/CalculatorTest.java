package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testOneNum() {
		assertEquals(2, Calculator.add("2"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testMoreMultipleNumbers(){
    	assertEquals(10, Calculator.add("1,2,3,4"));
    }

     @Test
    public void testNewLinesBetweenNums(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testNewLinesBetweenNums2(){
    	assertEquals(4, Calculator.add("1\n3"));
    }

    @Test
    public void testNegativeNumber() throws Exception{
    	try{
    		assertEquals(-4, Calculator.add("-4"));

    	}catch(Exception e){
    		String message = "Negatives not allowed: -4";
    		assertEquals(message, e.getMessage());
    	}
    }

    @Test
    public void testMultipleNegativeNumber() throws Exception{
    	try{
    		assertEquals(-3, Calculator.add("-4\n-1,2"));

    	}catch(Exception e){
    		String message = "Negatives not allowed: -4,-1";
    		assertEquals(message, e.getMessage());
    	}
    }



}