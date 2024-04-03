package VtappTestng.TNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OperationTest {
	
	  @Test
	    public void testAddition() {
		  Operation1 obj = new Operation1();
	        int result = obj.add(3, 5);
	        Assert.assertEquals(result, 8);
	    }

	    @Test
	    public void testSubtraction() {
	    	Operation1 obj = new Operation1();
	        int result = obj.subtract(10, 5);
	        Assert.assertEquals(result, 5);
	    }

	    @Test
	    public void testMultiplication() {
	    	Operation1 obj = new Operation1();
	        int result = obj.multiply(4, 5);
	        Assert.assertEquals(result, 20);
	    }

	    @Test
	    public void testDivision() {
	    	Operation1 obj = new Operation1();
	        int result = obj.divide(10, 2);
	        Assert.assertEquals(result, 5);
	    }

	    @Test(expectedExceptions = IllegalArgumentException.class)
	    public void testDivisionByZero() {
	    	Operation1 obj = new Operation1();
	        obj.divide(10, 0);
	    }
	
	
	

}
