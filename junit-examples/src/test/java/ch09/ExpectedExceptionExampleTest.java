package ch09;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * リスト9.11 例外の発生とメッセージを検証するテスト
 * @author shuji.w6e
 */
public class ExpectedExceptionExampleTest {
	
	@Rule
	public ExpectedException expException = ExpectedException.none();
	
	@Test
	public void 例外のテスト() {
		expException.expect(IllegalArgumentException.class);
		expException.expectMessage("arugument is null");
		throw new IllegalArgumentException();
	}
	
}
