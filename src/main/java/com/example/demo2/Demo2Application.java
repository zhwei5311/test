package com.example.demo2;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		showConnetion();
	}

	private void showConnetion() throws SQLException {
//        log.info(dataSource.toString());
		Connection conn = dataSource.getConnection();
//        log.info(conn.toString());
		conn.close();
	}

}
