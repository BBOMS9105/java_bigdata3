package Day05.Ex04_02_AccessModifier;

import Day05.Ex04_01_AccessModifier.Person;

public class Student extends Person {
	
	public Student() {
		super();
	}
	
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";
		height = 175;
		//age = 20;
		//weight = 60;
		setAge(20);
		setWeight(60);
	}

}
