package com.jdbc.bootjdbcexample;

import com.jdbc.bootjdbcexample.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjdbcexampleApplication implements CommandLineRunner {
	@Autowired
	private UserDao obj;
	public static void main(String[] args) {
		SpringApplication.run(BootjdbcexampleApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("table created");
		System.out.println(this.obj.createtable());
//		System.out.println(this.obj.insertuser(2,"raj",28));
//		System.out.println(this.obj.deleteuser(1));
		System.out.println(this.obj.updateuser(2));
	}
}
