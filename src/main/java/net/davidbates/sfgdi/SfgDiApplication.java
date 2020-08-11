package net.davidbates.sfgdi;

import net.davidbates.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myctrlr= (MyController) ctx.getBean("myController");
		String greeting = myctrlr.sayHello();
		System.out.println(greeting);
	}

}
