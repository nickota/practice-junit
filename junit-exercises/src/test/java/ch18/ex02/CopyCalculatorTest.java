package ch18.ex02;

import org.junit.Test;

public class CopyCalculatorTest extends CopyCalculator {

	@Test(expected = IllegalArgumentException.class)
	public void 分母0はIllegalArgumentException() throws Exception{
		CopyCalculator sut = new CopyCalculator();
		sut.divide(1, 0);
	}

}
