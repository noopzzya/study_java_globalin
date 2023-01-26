package com.setex;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":" +age;
	}
}

public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add("abc");
		set.add("abcd");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);
	}

}
