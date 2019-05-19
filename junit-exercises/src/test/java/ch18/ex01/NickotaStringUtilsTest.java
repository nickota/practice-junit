package ch18.ex01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class NickotaStringUtilsTest extends NickotaStringUtils {

	@Test
	public void toSnakeCaseはaaaを入力するとaaaが返される() {
		assertThat(NickotaStringUtils.toSnakeCase("aaa"), is("aaa"));
	}
	@Test
	public void toSnakeCaseはAbcDefを入力するとabc_defが返される() {
		assertThat(NickotaStringUtils.toSnakeCase("AbcDef"), is("_abc_def"));
	}
	@Test
	public void toSnakeCaseはpraJunitを入力するとpra_junitが返される() {
		assertThat(NickotaStringUtils.toSnakeCase("aaa"), is("aaa"));
	}
}
