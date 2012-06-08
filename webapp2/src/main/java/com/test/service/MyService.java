package com.test.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.test.types.MyPOJO;

public interface MyService extends Remote
{
	public MyPOJO getFromRemote() throws RemoteException ;
	
	public void modifyFromRemote( MyPOJO pojo ) throws RemoteException;
	
	public MyPOJO modifyFromRemoteAndReturn( MyPOJO pojo ) throws RemoteException;
}
