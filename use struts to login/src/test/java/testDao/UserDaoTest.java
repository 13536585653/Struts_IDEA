package testDao;

import org.demo.dao.UserDao;
import org.demo.entity.User;
import org.junit.Test;

/**
 * Created by langye on 2017/1/3.
 */
public class UserDaoTest {
	@Test
	public void test() {
		UserDao dao = new UserDao();
		User user1 = (User) dao.findUserByName("ly");
		System.out.println(user1.getUserName());
	}
}
