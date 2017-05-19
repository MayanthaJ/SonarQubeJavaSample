package com.rama41222.tests;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.rama41222.example.One;

public class OneTest {
	One one;
	@Before
public void setup(){
		 one = new One();
	}
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    assertEquals("foo", one.foo());
  }

  @Test
  public void testBoth() throws Exception {
    
    assertEquals("toto", one.toto());
    assertEquals("foo", one.foo());
  }
  
  @Test
  public void testEqual() throws Exception {
    assertEquals(true, one.messageEqual("hi","hi"));
  }

  @Test
  public void testNotEqual() throws Exception {
    assertEquals(false, one.messageEqual("hi","bye"));
  }
  
  @Test
  public void testF() throws Exception{
	  assertEquals(1, one.f(1));
  }
 
  @Test
  public void testF1() throws Exception{
	  assertEquals(0, one.f(4));
  }
  
  @Test
  public void testNPM(){
	  assertEquals(1, one. nullPointMethod("hi kala"));
  }
  

  @Test
  public void testNPMN() throws Exception{
	  assertEquals(0, one. nullPointMethod(""));
  }
}
