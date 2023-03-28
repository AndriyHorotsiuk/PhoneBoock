package com.phonebook.myPhonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class MyPhonebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyPhonebookApplication.class, args);
	}
}
