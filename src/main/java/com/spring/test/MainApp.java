package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.test.config.Config;
import java.lang.*;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Todo todo = context.getBean(Todo.class);
		System.out.println(todo.toString());
	}
}
