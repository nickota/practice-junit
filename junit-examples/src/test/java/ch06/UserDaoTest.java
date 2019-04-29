package ch06;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserDaoTest {
	
	public static class テーブルが空の場合 {
		
		UserDao sut;
		
		@Before
		public void setUp() throws Exception {
			DbUtils.drop("users");
			sut = new UserDao();
		}
		
		@Test
		public void getListで0件取得() throws Exception {
			List<User> actual = sut.getList();
			assertThat(actual, is(notNullValue()));
			assertThat(actual.size(), is(0));
		}
	}
	
	public static class getListで100件含まれる場合 {
		
		UserDao sut;
		
		@Before
		public void setUp() throws Exception {
			DbUtils.drop("users");
			DbUtils.insert("users", getClass().getResource("users.yaml"));
			sut = new UserDao();
		}
		
		@Test
		public void getList100件取得() throws Exception{
			List<User> actual = sut.getList();
			assertThat(actual,is(notNullValue()));
			assertThat(actual.size(), is(100));
		}
		
		
	}
}
