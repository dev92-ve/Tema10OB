package com.tema10.Tema10OB;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.BiConsumer;

//@SpringBootTest
class Tema10ObApplicationTests {


	@Test
	void contextLoads() {

		System.getenv().forEach(
				(key, value) -> System.out.println(key + ": " + value));
	}

}
