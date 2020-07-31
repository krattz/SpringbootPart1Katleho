package com.springbootpart1.springboot1katleho;

import Dao.FakeRepo;
import Service.UserServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot1katlehoApplicationTests {

	@Autowired
	UserServiceImpl userService;
	FakeRepo repo;
	@Test
	void contextLoads() {
		userService.addUser(6, "Congo", "Zumba");
		userService.removeUser(4);
		Assert.assertEquals(userService.getUser(1), repo.findUserById(1));
		Assert.assertEquals("Congo added", userService.getUser(6));
		Assert.assertFalse(userService.getUser(4).contains("Dan"));

	}

}
