package myexample.model;

import java.util.Objects;

public class Student {

	public int id;
	public String name;
	public int age;
	
	
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args)
	{
		/*Student s = new Student(1,"ram",22);
		Student s1 = new Student(2,"raj",34);
		Student s2 = new Student(1,"ram",22);
		
		System.out.println(s == s1);//false
		System.out.println(s1 == s2);//false
		System.out.println(s.equals(s2)); //true*/
	}


}
