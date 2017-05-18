package com.rama41222.FirstDayAtSchool.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rama41222.FirstDayAtSchool.Bag;
import com.rama41222.FirstDayAtSchool.Pencil;

public class addPencilsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPencils() {
		Bag fds = new Bag();
		Pencil p = new Pencil("Nataraja");
		fds.addPencils(p);
		assertTrue(fds.getMyPencils().contains(p));
		
		
	}

}
