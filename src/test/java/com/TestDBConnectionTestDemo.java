package com;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.DBConnectionTestDemo;

public class TestDBConnectionTestDemo {
	
	@Test
	public void testSomeTest1() {
		assertEquals(DBConnectionTestDemo.add(1, 2),3);
	}
	
	@Test
	public void testSomeTest2() {
		assertEquals(DBConnectionTestDemo.add(1, 2),5);
	}
	
	@Test
	public void testSomeTest3() {
		assertEquals(DBConnectionTestDemo.add(1, 2),3);
	}
}
