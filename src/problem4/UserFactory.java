package problem4;

public class UserFactory extends User {
	public static User createUserByEmail(String email) {
		User pcUser = new User();
		pcUser.setEmail(email);
		// email�� DB ��ȸ�Ͽ� PC���� �ҷ����� �ڵ�� ����
		return pcUser;
	}
	
	public static User createUserByPhNum(String phNum) {
		User mobUser = new User();
		mobUser.setPhNum(phNum);
		// email�� DB ��ȸ�Ͽ� ����ϰ��� �ҷ����� �ڵ�� ����
		return mobUser;
	}
}
