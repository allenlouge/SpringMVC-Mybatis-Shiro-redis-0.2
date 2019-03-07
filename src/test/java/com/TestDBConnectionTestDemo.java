package com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.DBConnectionTestDemo;

public class TestDBConnectionTestDemo {
	
	@Test
	public void testSomeTest() {
		assertEquals(DBConnectionTestDemo.add(1, 2),3);
	}
}
