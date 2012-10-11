package org.ff;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test1 {
	
	private Arabic2Roman a2r;
	
	@Before
	public void setUp(){
		a2r = new Arabic2Roman();
	}

	public String transform(int i){
		return a2r.transform(i);
	}
	
	@Test
	public void shouldTransform1() {
		assertEquals("I", transform(1));	}
	
	@Test
	public void shouldTransform2() {
		assertEquals("II", transform(2));
	}
	
	@Test
	public void shouldTransform3() {
		assertEquals("III", transform(3));
	}

	
	@Test
	public void shouldTransform4() {
		assertEquals("IV", transform(4));
	}
	
	@Test
	public void shouldTransform5() {
		assertEquals("V", transform(5));
	}
	
	@Test
	public void shouldTransform6_7_8() {
		assertEquals("VI", transform(6));
		assertEquals("VII", transform(7));
		assertEquals("VIII", transform(8));
	}
	
	@Test 
	public void shouldTransform9(){
		assertEquals("IX", transform(9));
	}
	
	@Test 
	public void shouldTransform10(){
		assertEquals("X", transform(10));
	}
	
	@Test 
	public void shouldTransform11_14_15(){
		assertEquals("XI", transform(11));
		assertEquals("XIV", transform(14));
		assertEquals("XV", transform(15));
		assertEquals("XIX", transform(19));
	}
	
	@Test 
	public void shouldTransform20(){
		assertEquals("XX", transform(20));
	}
	
	@Test 
	public void shouldTransform34(){
		assertEquals("XXXIV", transform(34));
	}
	
	@Test 
	public void shouldTransform49(){
		assertEquals("XLIX", transform(49));
	}
	
	
}
