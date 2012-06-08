package com.test.remote.caller;

import java.rmi.RemoteException;
import com.test.service.MyService;
import com.test.types.MyPOJO;

public class RemoteCall
{
	MyService service ;

	public void setService( MyService service )
	{
		this.service = service;
	}
	
	public String returnNameFromMethodCall1() throws RemoteException
	{
		return service.getFromRemote().getName();
	}
	
	public String returnNameFromMethodCall2() throws RemoteException
	{
		MyPOJO pojo = new MyPOJO();
		service.modifyFromRemote( pojo );
		return pojo.getName();
	}
	
	public String returnNameFromMethodCall3() throws RemoteException
	{
		MyPOJO pojo = new MyPOJO();
		pojo.setName( "sending this message from the client" );
		return service.modifyFromRemoteAndReturn( pojo ).getName();
	}
}
