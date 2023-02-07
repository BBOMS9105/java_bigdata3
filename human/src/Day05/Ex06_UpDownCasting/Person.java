package Day05.Ex06_UpDownCasting;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 0);
	}
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//메소드
	public String work() {
		return "일을합니다.";
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
