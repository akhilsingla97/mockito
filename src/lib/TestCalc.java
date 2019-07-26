package lib;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

public class TestCalc {
	AddCalc obj;
	Calculator calc;
	@Before
	public void setup() {
		calc = mock(Calculator.class);
		when(calc.addNumbers(2, 3)).thenReturn(5);
		obj = new AddCalc();
		obj.setCalc(calc);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Assert.assertEquals(calc.addNumbers(2, 3), obj.addVal(2, 3));
	}

}
