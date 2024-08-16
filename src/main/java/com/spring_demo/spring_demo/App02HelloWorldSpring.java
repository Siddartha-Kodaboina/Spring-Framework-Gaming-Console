package com.spring_demo.spring_demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_demo.spring_demo.game.GameRunner;
import com.spring_demo.spring_demo.game.MarioGame;
import com.spring_demo.spring_demo.game.PacmanGame;
import com.spring_demo.spring_demo.game.SuperContraGame;

/**
 * 
 */
public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Using spring to create loosely couple code bases
		// 1. Spring context
		// - we use AnnotationConfigApplicationContext class
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure the things that needs to be managed by springs using @ Configuration
		// - The things/classes that can be managed by spring are called as spring beans 
		// --- Created a configuration class HelloWorldConfiguration
		// --- 
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("father"));
//		var person = context.getBean(Person.class);
//		System.out.println(person.name() + " : " + person.age() );
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1.age());
		
		Person person3 = (Person) context.getBean("person3");
		System.out.println(person3.name() + " : " + person3.age() + " : " + person3.address());
		
		Person person4 = (Person) context.getBean("person4");
		System.out.println(person4.name() + " : " + person4.age() + " : " + person4.address());
		
//		var address = context.getBean(Address.class);
//		System.out.println(address.firstLine() + " : " + address.city() );
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
	}

}
