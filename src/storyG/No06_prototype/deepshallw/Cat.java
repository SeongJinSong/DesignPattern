package storyG.No06_prototype.deepshallw;

public class Cat implements Cloneable{
	private String name;
	private Integer age;
	private Age ageInfo;
	public Age getAgeInfo() {
		return ageInfo;
	}

	public void setAgeInfo(Age ageInfo) {
		this.ageInfo = ageInfo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat)this.clone();
		ret.setAgeInfo(new Age(this.ageInfo.getYear(), this.ageInfo.getValue()));
		return ret;
	}
	
}
