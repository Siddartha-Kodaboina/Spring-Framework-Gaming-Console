package com.spring_demo.spring_demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Steve";
	}
	
	@Bean
	public int age() {
		return 17;
	}
	@Bean
	public String father() {
		return "Steve father";
	}
	
	@Bean("person1")
	@Primary
	public Person person() {
		var personObj = new Person("sid", 23, address()); 
		return personObj;
	}
	
	@Bean("person2")
	public Person person2() {
		var personObj = new Person("sid2", 23, address()); 
		return personObj;
	}
	
	@Bean("person3")
	public Person person3() {
		var personObj = new Person(name(), age(), address()); 
		return personObj;
	}
	
	// There is an another way to pass springbeans(you should use bean names) to a record, 
	// 1. first you need to pass required beans as parameters 
	// 2. Use these params as attributes instead of bean functions
	@Bean("person4")
	public Person person4(String name, int age, Address address2) {
		var personObj = new Person(name, age, address2); 
		return personObj;
	
	}
	
	@Bean("person5")
	public Person person5(String name, int age, @Qualifier("address3Qualifier") Address address) {
		var personObj = new Person(name, age, address); 
		return personObj;
	}
	
	
	
	@Bean(name="address")
	@Primary
	public Address address() {
		var addressObj = new Address("101 E San fernando", "San Jose"); 
		return addressObj;
	}
	
	@Bean(name="address2")
	public Address address2() {
		var addressObj = new Address("33 South San fernando", "San Jose"); 
		return addressObj;
	}
	
	@Bean(name="address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		var addressObj = new Address("33 South San fernando", "Milan"); 
		return addressObj;
	}
	

}
