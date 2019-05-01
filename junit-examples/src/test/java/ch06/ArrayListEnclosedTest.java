package ch06;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * リスト6.6 構造化されたArrayListのテストクラス
 * @author shuji.w6e
 */
@RunWith(Enclosed.class)
public class ArrayListEnclosedTest {
	private ArrayList<String> sut;
	
	public class listに1件ある場合 {
		
		@Before
		public void setUp() throws Exception{
			sut = new ArrayList<String>();
			sut.add("A");
		}
		
		@Test
		public void sizeは1を返す() throws Exception{
			assertThat(sut,is(notNullValue()));
			assertThat(sut.size(), is(1));
		}
		
	}
	
	public class listに2件ある場合 {
		
		@Before
		public void setUp() throws Exception{
			sut = new ArrayList<String>();
			sut.add("A");
			sut.add("B");
		}
		
		@Test
		public void sizeは2を返す() throws Exception{
			assertThat(sut, is(notNullValue()));
			assertThat(sut.size(),is(2));
		}
	}
}
