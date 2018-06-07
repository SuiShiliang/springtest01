package springtest03_使用接口;

import springtest03_使用接口.EnumType.Gender;

public class Student {

	private int number;
	private String name;
	private Gender gender;
	private int age;
	private String major;
	public Student(int number, String name, Gender gender, int age, String major) {
		super();
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	@Override
	public String toString() {
		return "学号：" + number + "\n 姓名：" + name + "\n性别：" + gender + "\n 年龄：" + age + "\n 专业："
				+ major ;
	}

	
	
	
}
