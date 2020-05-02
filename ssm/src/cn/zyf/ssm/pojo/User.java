package cn.zyf.ssm.pojo;


public class User {
	private Integer id;//Field 字段，成员变量，不是属性
	private String name;//Field 字段，成员变量，不是属性
	private String password;
	private Integer age;
	
//	private String firstName;//字段
//	private String lastName;//字段
	//属性： fullName
//	public String getFullName() {
//		return this.firstName+this.lastName;
//	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User(Integer id, String name, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
	
	
}

