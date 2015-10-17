package problem4;

public class LoginService {

	public static void main(String[] args) {
		String loginByEmail = "nexon@nexon.net";
		String loginByPhNum = "123-456-7890";
		
		User pcUser = UserFactory.createUserByEmail(loginByEmail);
		User mobUser = UserFactory.createUserByPhNum(loginByPhNum);
	}

}
