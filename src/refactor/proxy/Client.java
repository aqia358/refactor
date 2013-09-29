package refactor.proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Client {
	public static Log log = LogFactory.getLog(Client.class);
	public static void main(String args[]){
		log.error("error");
		log.info("info");
		System.out.println("proxy-----");
		FatherProxy fp = new FatherProxy(new FatherImpl());
		fp.work();
		System.out.println("decorator-----");
		FatherDecorator fd = new FatherDecoratorBefore(new FatherDecoratorAfter(new FatherImpl()));
		fd.work();
		System.out.println("Dynamic proxy-----");
		DynamicProxy dp = new DynamicProxy(new FatherImpl());
		Father f = dp.proxy();
		f.work();
		System.out.println("CGLib proxy-----");
		FatherImpl fi = CGLibProxy.getInstance().getProxy(FatherImpl.class);
		fi.work();
	}
}
