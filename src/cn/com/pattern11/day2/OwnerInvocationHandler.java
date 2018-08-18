package cn.com.pattern11.day2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	
	private PersonBean personBean;
	
	public OwnerInvocationHandler(PersonBean personBean) {
		super();
		this.personBean = personBean;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		if (methodName.startsWith("get")) {
			return method.invoke(personBean, args);
		} else if (methodName.equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if (methodName.startsWith("set")) {
			return method.invoke(personBean, args);
		}
		
		return null;
	}

}
