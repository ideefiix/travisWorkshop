package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testRemove() {
        List l = new List();
        l.add(1);
        l.add(2);
        // Call method to test
        l.remove();
        assertTrue(l.remove() == 1); // Return 1
    }

    @Test
    public void testGet(){
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        assertTrue(l.get(2) == 3); // Check values
    }
    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.get(-1); // Exception!!!
    }

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }
}
