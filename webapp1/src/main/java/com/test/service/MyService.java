package com.test.service;

import com.test.types.MyPOJO;

public interface MyService
{
	public MyPOJO getFromRemote();
	
	public void modifyFromRemote( MyPOJO pojo );
	
	public MyPOJO modifyFromRemoteAndReturn( MyPOJO pojo );
}
