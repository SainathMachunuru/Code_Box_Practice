package com.myutil.designpatterns.prototype;

import com.myutil.designpatterns.prototype.PrototypeFactory.ModelType;

public class TestPrototypePattern 
{
	public static void main(String[] args) 
	{
		try 
		{
			//Movie mv = (Movie) PrototypeFactory.getInstance(ModelType.MOVIE);
			
			String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);
			
			String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
