package ch11;

import java.util.List;

import ch06.User;

/**
 * リスト11.18 UserDaoの例外を送出するスタブ
 * @author shuji.w6e
 */
public class UserDaoStub implements UserDao {
	
	@Override
	public User find(String userId) throws UserNotFoundException{
		throw new UserNotFoundException("user not found");
	}
	
}