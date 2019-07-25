package com.myutil.java8features;

public class InterfaceDefaultStaticMethodTest implements Interface1,Interface2{

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		System.out.println("Impl calass logging::" + str);
		
	}

	@Override
	public void method2(String str) {
		// TODO Auto-generated method stub
		System.out.println("Imp2 calass logging::" + str);
		
	}

	@Override
	public void log(String str) {
		Interface1.super.log(str);
		//System.out.println("Impl class: "+str);
	}
	
	public static void main(String[] args) {
		Interface1 i1 = new InterfaceDefaultStaticMethodTest();
		i1.method1("sai");
		i1.log("sai");
		Interface1.print("sai");
		System.out.println("******************");
		Interface2 i2 = new InterfaceDefaultStaticMethodTest();
		i2.method2("sai");
		i2.log("sai");
		Interface1.print("sai");
	}
	

	

}
