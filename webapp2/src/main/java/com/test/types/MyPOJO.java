package com.test.types;

import java.io.Serializable;

public class MyPOJO implements Serializable
{
	String name;

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
	
	
}
