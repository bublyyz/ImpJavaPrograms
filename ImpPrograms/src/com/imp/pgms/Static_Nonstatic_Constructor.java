package com.imp.pgms;
	class A
	{
		static
		{
			System.out.println("Static of Super Class");
		}
		{
			System.out.println("Non Static of Super Class");
		}
		A()
		{
			System.out.println("Constructor of Super Class");
		}
		}
	class B extends A
	{
		static
		{
			System.out.println("Static of Sub Class");
		}	
		
		{
			System.out.println("Non Static of Sub Class");
		}
		B()
		{
			System.out.println("Constructer of Sub Class");
		}
	}
	
	public class Static_Nonstatic_Constructor {

		public static void main(String[] args) {
		
			B b=new B();

	}

}
