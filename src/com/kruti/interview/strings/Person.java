package com.kruti.interview.strings;


public class Person {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }

	        if (!Person.class.isAssignableFrom(obj.getClass())) {
	            return false;
	        }

	        Person other = (Person)obj;
	        return other.name.equals(name) && other.age == age;
	    }
	    */
}
