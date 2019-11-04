package com.evry;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Figure;
import main.Square;
import main.Triangle;

public class TriangleTest {

	private Triangle triangle; 

	@Before
	public void setUp() {
		triangle= new Triangle(2,3);
	}
	
	@After
	public void deleteTriangleObject() {
		triangle=null;
	}

	@Test
	public void newTriangle_instantiatesCorrectly() {
		assertEquals(true, triangle instanceof Triangle);
		assertEquals(true, new Triangle(2,3) instanceof Triangle);

	}  
	
	@Test
	public void triangleAreaTest() {
		assertEquals(3.0, triangle.getArea(),0.001);

	}  

	@Test
	public void triangleTypeTest() {
		assertEquals("Triangle", triangle.getType());
	} 

	@Test(expected = IllegalArgumentException.class)  
	public void triangleSetBaseErrorTest() {
		new Triangle(-2.5,2); //negative base not allow! 
	} 


}

