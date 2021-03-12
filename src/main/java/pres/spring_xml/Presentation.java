package pres.spring_xml;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
		IMetier metier = (IMetier) context.getBean("m");
		System.out.println("with spring ioc "+metier.calcul());
	}
}
