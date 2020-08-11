package net.davidbates.sfgdi;

import net.davidbates.sfgdi.controllers.ConstructorInjectedController;
import net.davidbates.sfgdi.controllers.MyController;
import net.davidbates.sfgdi.controllers.PropertyInjectedController;
import net.davidbates.sfgdi.controllers.SetterInjectionController;
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

		System.out.println("-------------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------------Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("-------------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("-------------------Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());


	}

}
