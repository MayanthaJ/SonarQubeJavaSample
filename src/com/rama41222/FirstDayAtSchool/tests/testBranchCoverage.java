package com.rama41222.FirstDayAtSchool.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rama41222.FirstDayAtSchool.Bag;

public class testBranchCoverage {
	Bag fds;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		fds = new Bag();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsfandlequal() {
		assertTrue(fds.isfandlequal("XX"));
	}

}
