package cn.com.pattern11.day2;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	private void drive() {
		PersonBean person = new PersonBeanImpl(); 
		PersonBean ownerProxy = getOwnerProxy(person);
		ownerProxy.setName("zhufeng");
		ownerProxy.setGender("male");
		ownerProxy.setInterest("math");
		System.out.println("name: " + ownerProxy.getName());
		System.out.println("gender: " + ownerProxy.getGender());
		System.out.println("interests: " + ownerProxy.getInterests());
		
	}

	private PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), 
				new OwnerInvocationHandler(personBean));
	}
}
