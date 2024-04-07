package com.accessspe;

public class Base {

	//declare default,public,private,protected
	
	int vardefault=10;
	public int varpublic=20;
	protected int varprotected=30;
	private int varprivate=40;
	
	//declare default,public,protected,private
	
	void methoddefault()
	{
		System.out.println("default access base class");
		System.out.println("default variable :"+ vardefault);
	}
	public void methodpublic()
	{
		System.out.println("default access base class");
		System.out.println("default variable :"+ varpublic);
	}

	private void methodprivate()
	{
		System.out.println("default access base class");
		System.out.println("default variable :"+ varprivate);
	}

	protected void methodprotected()
	{
		System.out.println("default access base class");
		System.out.println("default variable :"+ varprotected);
	}

	
}
