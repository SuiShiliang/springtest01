package springtest07;

import springtest07.EnumType.Gender;

public class Student {

	private int number;
	private String name;
	private Gender gender;
	private int age;
	private String major;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "学号：" + number + "\n 姓名：" + name + "\n性别：" + gender + "\n 年龄：" + age + "\n 专业："
				+ major ;
	}

	
	
	
}
