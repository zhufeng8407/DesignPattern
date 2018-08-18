package cn.com.pattern11.day1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	protected MyRemoteImpl() throws RemoteException {
		super();
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}
	
	public static void main(String[] args) throws RemoteException {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		} catch(Exception ex) {
			
		}
	}

}
