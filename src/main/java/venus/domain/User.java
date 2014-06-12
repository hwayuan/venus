package venus.domain;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class User {
	private String userId;
	private String password;
	private String nickName;
	private String sex;
	private int age;

	
	public User(){		
	}
	
	public User(String userId, String password, String nickName) {
		this.userId = userId;
		this.password = password;
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
}
