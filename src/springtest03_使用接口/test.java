package springtest03_使用接口;

import springtest03_使用接口.EnumType.Gender;

public class test {
	public static void main(String[] args) {
		
		Student student3 = new Student(3, "王五", Gender.Male, 17, "财会");
		System.out.println(student3.hashCode());
		System.out.println(student3.getClass());
		System.out.println(student3);
	}
}
