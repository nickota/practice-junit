package ch18.ex04;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CopyNumberUtilsTest extends CopyNumberUtils {

	@Test
	public void 入力値に10を与えるとtrueを返す() throws Exception{
		assertThat(CopyNumberUtils.isEven(10), is(true));
	}

	@Test
	public void 入力値に7を与えるとfalseを返す() throws Exception{
		assertThat(CopyNumberUtils.isEven(10), is(false));
	}
}
