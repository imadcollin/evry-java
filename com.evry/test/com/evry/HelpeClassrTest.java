package com.evry;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Figure;
import main.SomeHelperClass;
import main.Square;
import main.SystemException;
import main.Triangle;

public class HelpeClassrTest {

	private SomeHelperClass helper;
	private ArrayList<Figure> list;
	@Before
	public void setUp() throws SystemException {
		helper= new SomeHelperClass();	
		list=helper.getFigures();

	} 

	@After
	public void deleteHelperAndList() {
		helper=null;
		list = null; 
	}

	@Test 
	public void getFiguresListIsNotEmptytest() {
		assertTrue(!list.isEmpty());
	}


	@Test
	public void getFiguresListHaSixElementst() {
		assertEquals(5,list.size());
	}


	@Test
	public void getFiguresListHasSquareAsFirstItem() {
		list.add(new Square(2));
		assertEquals("Square",list.get(0).getType());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void getLstItemOutOfBoundsTest() {
		list.get(8);
	}

	@Test
	public void sortListAscendingTest() {
		ArrayList<Figure> list = new ArrayList<Figure>();
		list.add(new Square(1));
		list.add(new Square(3));
		list.add(new Square(2));
		assertTrue(SomeHelperClass.sort(list,1).get(0).getArea()==1);
		assertTrue(SomeHelperClass.sort(list,1).get(1).getArea()==4);
		assertTrue(SomeHelperClass.sort(list,1).get(2).getArea()==9);

	}   

	@Test
	public void sortListDecendingTest() {
		ArrayList<Figure> list = new ArrayList<Figure>();
		list.add(new Square(1));
		list.add(new Square(3));
		list.add(new Square(2));
		assertTrue(SomeHelperClass.sort(list,2).get(0).getArea()==9);
		assertTrue(SomeHelperClass.sort(list,2).get(1).getArea()==4);
		assertTrue(SomeHelperClass.sort(list,2).get(2).getArea()==1);

	}  

	@Test
	public void sortListByTypeTest() {
		ArrayList<Figure> list = new ArrayList<Figure>();
		list.add(new Square(1));
		list.add(new Square(3));
		list.add(new Triangle(2, 2));
		list.add(new Square(2));
		assertTrue(SomeHelperClass.sort(list,3).get(0).getType()=="Square");
		assertTrue(SomeHelperClass.sort(list,3).get(1).getType()=="Square");
		assertTrue(SomeHelperClass.sort(list,3).get(2).getType()=="Square");
		assertTrue(SomeHelperClass.sort(list,3).get(3).getType()=="Triangle");

	}  
	@Test
	public void inputValidateNamebrTest() {
		String input1 = "1";
		String input2 = "2";
		String input3 = "100";
		InputStream in1,in2,in3; 

		in1= new ByteArrayInputStream(input1.getBytes());
		System.setIn(in1);

		assertEquals(1, SomeHelperClass.validateInput());


		in2= new ByteArrayInputStream(input2.getBytes());
		System.setIn(in2);

		assertEquals(2, SomeHelperClass.validateInput());


		in3= new ByteArrayInputStream(input3.getBytes());
		System.setIn(in3);
		assertEquals(100, SomeHelperClass.validateInput());

	}   
	
	@Test(expected = Exception.class)  
	public void inputNotValidateTest() {
		String input1 = "f";

		InputStream in1= new ByteArrayInputStream(input1.getBytes());
		System.setIn(in1);

		assertEquals("f", SomeHelperClass.validateInput());


	} 

}


