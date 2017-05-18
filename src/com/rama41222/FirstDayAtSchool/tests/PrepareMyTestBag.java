package com.rama41222.FirstDayAtSchool.tests;
import com.rama41222.FirstDayAtSchool.*;
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

public class PrepareMyTestBag {
	Book b;
	NoteBook c;
	Pen p;
	Pencil x;
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

	@Test(timeout=1000)
	public void testPrepareMyBag() {
	

		b = new Book("Jungle Book");
        c = new NoteBook("Maths");
        c.setText("MY name is maths");
        p = new Pen("Reynolds");
        x = new Pencil("HB");
        
        fds.addBooks(b);
        fds.addNoteBooks(c);
        fds.addPens(p);
        fds.addPencils(x);
        	
         
        assertNotNull(fds.prepareMyBag() );
        
	}
	
	@Test(timeout=10)
	public void testIsF(){
		assertTrue(fds.isfandlequal("BXXXXBBX"));
	}

}
