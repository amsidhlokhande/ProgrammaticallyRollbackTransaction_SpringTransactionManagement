package x.y.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x.y.bean.Foo;
import x.y.service.FooService;

public class Boot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-beans-config.xml");
		FooService fooService = (FooService) ctx.getBean("fooService");
		fooService.insertFoo (new Foo());
		//System.out.println(fooService);

	}

}
