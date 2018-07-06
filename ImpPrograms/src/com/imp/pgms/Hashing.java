package com.imp.pgms;

import java.util.HashSet;	

	public class Hashing {
		
		static class Student {
			int id;
			String name;
			
			public Student(int id, String name) {
				super();
				this.id = id;
				this.name = name;
			}
			
			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + "]";
			}
			
			@Override
			public int hashCode() {
				return id;
			}
			
			@Override
			public boolean equals(Object o1) {
				return this.hashCode()==o1.hashCode();
			}
		}
	
		public static void main(String[] args) {
			HashSet<Student> hs1 = new HashSet<Student>();	
			hs1.add(new Student(111, "Ramesh"));
			hs1.add(new Student(112, "Suresh"));
			hs1.add(new Student(111, "Ramesh"));
			System.out.println(hs1);
	}

}
