package cn.com.pattern11.day1.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import cn.com.pattern11.day1.MyRemote;

public class MyRemoteClient {
	public static void main(String[] args) {
			new MyRemoteClient().go();
	}

	public void go() {
		
		try {
			MyRemote service = (MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(service.sayHello());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
