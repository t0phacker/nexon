package problem4;

import java.util.List;

public class User {
	private String email;
	private String phNum;
	private List<PCGameBO> pcGame;
	private List<MobGameBO> mobGame;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNum() {
		return phNum;
	}
	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	public List<PCGameBO> getPcGame() {
		return pcGame;
	}
	public void setPcGame(List<PCGameBO> pcGame) {
		this.pcGame = pcGame;
	}
	public List<MobGameBO> getMobGame() {
		return mobGame;
	}
	public void setMobGame(List<MobGameBO> mobGame) {
		this.mobGame = mobGame;
	}
}
