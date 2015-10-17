package problem4;

public class UserFactory extends User {
	public static User createUserByEmail(String email) {
		User pcUser = new User();
		pcUser.setEmail(email);
		// email로 DB 조회하여 PC게임 불러오는 코드는 생략
		return pcUser;
	}
	
	public static User createUserByPhNum(String phNum) {
		User mobUser = new User();
		mobUser.setPhNum(phNum);
		// email로 DB 조회하여 모바일게임 불러오는 코드는 생략
		return mobUser;
	}
}
