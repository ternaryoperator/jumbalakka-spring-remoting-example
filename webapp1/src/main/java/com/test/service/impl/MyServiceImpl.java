package com.test.service.impl;

import com.test.service.MyService;
import com.test.types.MyPOJO;

public class MyServiceImpl implements MyService
{

	public MyPOJO getFromRemote()
	{
		MyPOJO pojo = new MyPOJO();
		pojo.setName( "My Remote POJO on Webapp1 - method getFromRemote" );
		return pojo;
	}

	public void modifyFromRemote( MyPOJO pojo )
	{
		pojo.setName( "My Remote POJO on Webapp1 - method modifyFromRemote" );
	}
	
	public MyPOJO modifyFromRemoteAndReturn( MyPOJO pojo )
	{
		pojo.setName( "My Remote POJO on Webapp1 - method modifyFromRemote : With Name sent: " + pojo.getName() );
		return pojo;
	}
}
