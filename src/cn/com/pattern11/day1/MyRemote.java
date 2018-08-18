package cn.com.pattern11.day1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
	String sayHello() throws RemoteException;
}
