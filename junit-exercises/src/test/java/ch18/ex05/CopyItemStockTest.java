package ch18.ex05;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * リスト18.10 void型を戻り値とするメソッドのテスト
 * 
 * @author shuji.w6e
 */
@RunWith(Enclosed.class)
public class CopyItemStockTest extends CopyItemStock {

	public static class 初期状態 {

		ItemStock sut;
		Item book;

		@Before
		public void setUp() {
			sut = new ItemStock();
			book = new Item("本", 1000);
		}

		@Test
		public void getNumで0が取得できる() {
			assertThat(sut.getNum(book), is(0));
		}

		@Test
		public void 一つitemを追加するとgetNumで1が取得できる() {
			sut.add(book);
			assertThat(sut.getNum(book), is(1));
		}
	}

	public static class itemが一つ追加された状態 {

		ItemStock sut;
		Item book;

		@Before
		public void setUp() {
			sut = new ItemStock();
			book = new Item("本", 1000);
			sut.add(book);
		}

		@Test
		public void 一つitemを追加するとgetNumで1が取得できる() {
			assertThat(sut.getNum(book), is(1));
		}

		@Test
		public void 二つ同じitemが追加されるとgetNumで2が取得できる() {
			sut.add(book);
			assertThat(sut.getNum(book), is(2));
		}
		
		@Test
		public void 異なるitemを追加するとgetNumで1が取得できる() {
			Item pen = new Item("ペン", 100);
			sut.add(pen);
			assertThat(sut.getNum(book), is(1));
		}
	}

}
