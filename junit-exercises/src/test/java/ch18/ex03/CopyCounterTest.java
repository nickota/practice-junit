package ch18.ex03;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CopyCounterTest extends CopyCounter {

	public static class 初期状態の場合 {

		CopyCounter sut;

		@Before
		public void setUp() {
			sut = new CopyCounter();
		}

		@Test
		public void 初期状態では1が返される() {
			assertThat(sut.increment(), is(1));
		}
	}

	public static class 一回呼び出された場合 {

		CopyCounter sut;

		@Before
		public void setUp() {
			sut = new CopyCounter();
			sut.increment();
		}

		@Test
		public void 一回めの呼び出しでは2が返される() {
			assertThat(sut.increment(), is(2));
		}
	}

	public static class 二回呼び出された場合 {

		CopyCounter sut;

		@Before
		public void setUp() {
			sut = new CopyCounter();
			for (int i = 0; i < 50; i++) {
				sut.increment();
			}
		}

		@Test
		public void 五十回めの呼び出しでは51が返される() {
			assertThat(sut.increment(), is(51));
		}
	}
}
