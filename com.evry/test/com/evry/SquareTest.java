package com.evry;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.*;

public class SquareTest {

	private Square square; 

	@Before
	public void setUp() {
		square= new Square(2.5);
	}
	
	@After
	public void deleteSquareObject() {
		square=null;
	}

	@Test
	public void newSquare_instantiatesCorrectly() {
		assertEquals(true, new Square(2.5) instanceof Square);

	} 
	
	@Test
	public void squareAreaTest() {
		assertEquals(6.25, square.getArea(),0.001);
	} 

	@Test
	public void squareTypeTest() {
		assertEquals("Square", square.getType());
	} 

	@Test(expected = IllegalArgumentException.class)  
	public void SquareSetBaseErrorTest() {
		new Square(-2.5); //negative base not allow! 

	} 

}



