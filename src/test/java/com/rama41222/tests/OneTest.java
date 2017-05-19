package com.rama41222.tests;
import com.rama41222.example.*;
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
}
