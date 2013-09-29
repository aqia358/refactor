package refactor.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudyInvoctionHandler implements InvocationHandler {

	private Object target;

	public StudyInvoctionHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		method.invoke(target, args);
		return null;
	}

	@SuppressWarnings("unchecked")
	public <T> T proxy() {
		return (T) java.lang.reflect.Proxy.newProxyInstance(target.getClass()
				.getClassLoader(), target.getClass().getInterfaces(), this);
	}

	public static void main(String args[]) {
		System.out.println("Hello");
		Father f = new StudyInvoctionHandler(new Son()).proxy();
		f.hello();
	}
}
