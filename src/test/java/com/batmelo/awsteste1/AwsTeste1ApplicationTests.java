package com.batmelo.awsteste1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AwsTeste1ApplicationTests {

	@Test
	void contextLoads() {

		throw new RuntimeException("Force fail");
	}

}
