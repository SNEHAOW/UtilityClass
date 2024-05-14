import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class UtilityTest {

	/*
	 * Note for students: these test cases are not comprehensive; you must add your
	 * test cases to test your solution for this lab thoroughly.
	 * 
	 */
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	@Test
	public void test_01_01_()  {
		List<String> myList = new ArrayList<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		Utility<String> ut = new Utility<String>(myList); 
		myList.add("Joe");
		boolean actual = ut.getList().size() == 4; 
		boolean expected = true;
		assertEquals("Overloaded Constructor Failed! Deep Copying is expected", expected, actual);
	}
	@Test
	public void test_01_02_()  {
		List<String> myList = new ArrayList<String>(); 
		Utility<String> ut = new Utility<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		myList.add("Joe");

		boolean actual = ut.getList().size() == 0; 
		boolean expected = true;
		assertEquals("Overloaded Constructor Failed! Deep Copying is expected", expected, actual );
		
	}
	
	@Test
	public void test_02_01_()  {
		List<String> myList = new ArrayList<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		Utility<String> ut = new Utility<String>(myList); 
		int actual = ut.linearSearch("Bob"); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
		
	}
	
	
	@Test
	public void test_02_02_()  {
		List<Integer> myList = new ArrayList<Integer>(); 
		myList.add(1); 
		myList.add(2); 
		myList.add(3); 
		myList.add(4); 
		Utility<Integer> ut = new Utility<Integer>(myList); 
		int actual = ut.linearSearch(3); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given", expected, actual);
	}
	
	
	@Test
	public void test_02_03_()  {
		List<Float> myList = new ArrayList<Float>(); 
		myList.add(1.0f); 
		myList.add(2.0f); 
		myList.add(3.0f); 
		myList.add(4.0f); 
		Utility<Float> ut = new Utility<Float>(myList); 
		int actual = ut.linearSearch(3.0f); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_02_04_()  {
		List<Double> myList = new ArrayList<Double>(); 
		myList.add(1.0); 
		myList.add(2.0); 
		myList.add(3.0); 
		myList.add(4.0); 
		Utility<Double> ut = new Utility<Double>(myList); 
		int actual = ut.linearSearch(3.0); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	
	@Test
	public void test_02_05_()  {
		List<Character> myList = new ArrayList<Character>(); 
		myList.add('a'); 
		myList.add('b'); 
		myList.add('c'); 
		myList.add('d'); 
		Utility<Character> ut = new Utility<Character>(myList); 
		int actual = ut.linearSearch('c'); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_02_06_()  {
		List<Boolean> myList = new ArrayList<Boolean>(); 
		myList.add(true); 
		myList.add(true); 
		myList.add(false); 
		myList.add(false); 
		Utility<Boolean> ut = new Utility<Boolean>(myList); 
		int actual = ut.linearSearch(false); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_02_07_()  {
		Point p1 = new Point (1,2);
		Point p2 = new Point (2,1);
		Point p3 = new Point (0,0);	
		List<Point> myList = new ArrayList<Point>(); 
		myList.add(p1); 
		myList.add(p2); 
		myList.add(p3); 
		Utility<Point> ut = new Utility<Point>(myList); 
		int actual = ut.linearSearch(p3); 

		int expected = 2; 
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	
	@Test
	public void test_02_08_()  {
		Point p1 = new Point (1,2);
		Point p2 = new Point (2,1);
		Point p3 = new Point (0,0);	
		List<Point> myList = new ArrayList<Point>(); 
		myList.add(p1); 
		myList.add(p2); 
		myList.add(p3); 
		Utility<Point> ut = new Utility<Point>(myList); 
		Point p4 = new Point (3,0);	
		int actual = ut.linearSearch(p4); 

		int expected = -1;  
		assertEquals("LinearSearch Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	
	
	@Test
	public void test_03_01_()  {
		List<Integer> myList = new ArrayList<Integer>(); 
		myList.add(0); 
		myList.add(1); 
		myList.add(2); 
		myList.add(3); 
		Utility<Integer> ut = new Utility<Integer>(myList); 

		List<Number> myList2 = new ArrayList<Number>(); 
		myList2.add(0); 
		myList2.add(1); 
		myList2.add(2); 
		myList2.add(3); 
		ut.mergeList(myList2); 
		boolean actual = true;
		for (int i= 0; i < 4; i++) {
			if ((Integer) myList2.get(i) != i || (Integer)myList2.get(i+4)!= i) {
				actual = false; 
				break; 
			}
		}

		boolean expected = true; 
		assertEquals("mergeList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	@Test
	public void test_03_02_()  {
		List<Integer> myList = new ArrayList<Integer>(); 
		myList.add(0); 
		myList.add(1); 
		myList.add(2); 
		myList.add(3); 
		Utility<Integer> ut = new Utility<Integer>(myList); 

		List<Number> myList2 = new ArrayList<Number>(); 
		myList2.add(0); 
		myList2.add(1); 
		myList2.add(2); 
		myList2.add(5); 
		ut.mergeList(myList2); 
		boolean actual = true;
		for (int i= 0; i < 4; i++) {
			if ((Integer) myList2.get(i) != i || (Integer)myList2.get(i+4)!= i) {
				actual = false; 
				break; 
			}
		}

		boolean expected = false;
		assertEquals("mergeList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	
	@Test
	public void test_03_03_()  {
		List<Integer> myList = new ArrayList<Integer>(); 
		myList.add(0); 
		myList.add(1); 
		myList.add(2); 
		myList.add(3); 
		Utility<Integer> ut = new Utility<Integer>(myList); 

		List<Object> myList2 = new ArrayList<Object>(); 
		myList2.add((String) "John"); 
		myList2.add((String)"Jane"); 
		myList2.add((String)"Bob"); 
		myList2.add((String)"Alice"); 
		ut.mergeList(myList2); 
		boolean actual = true;
		if (((String) myList2.get(0)).compareTo("John") != 0 || 
				((String) myList2.get(1)).compareTo("Jane") != 0 ||
				((String) myList2.get(2)).compareTo("Bob") != 0 || 
				((String) myList2.get(3)).compareTo("Alice") != 0)
					actual = false; 

		for (int i= 4; i < 8; i++) {
			if ((Integer) myList2.get(i) != i - 4 ) {
				actual = false; 
				break; 
			}
		}
		boolean expected = true; 
		assertEquals("mergeList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_01_()  {
		List<String> myList = new ArrayList<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		Utility<String> ut = new Utility<String>(myList); 
		List<String> myList2 = new ArrayList<String>(); 
		myList2.add("John"); 
		myList2.add("Jane"); 

		boolean actual = ut.containList(myList2); 

		boolean expected = true; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	
	@Test
	public void test_04_02_()  {
		List<String> myList = new ArrayList<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		Utility<String> ut = new Utility<String>(myList); 
		List<String> myList2 = new ArrayList<String>(); 
		myList2.add("John"); 
		myList2.add("Joe"); 

		boolean actual = ut.containList(myList2); 

		boolean expected = false; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}

	
	@Test
	public void test_04_03_()  {
		List<String> myList = new ArrayList<String>(); 
		myList.add("John"); 
		myList.add("Jane"); 
		myList.add("Bob"); 
		myList.add("Alice"); 
		Utility<String> ut = new Utility<String>(myList); 
		List<String> myList2 = new ArrayList<String>(); 
		boolean actual = ut.containList(myList2); 
		boolean expected = true; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_04_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		boolean actual = ut.containList(myList2); 
		boolean expected = true; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_05_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		myList2.add(int1); 
		myList2.add(int2); 
		boolean actual = ut.containList(myList2); 
		boolean expected = true; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_06_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		myList2.add(int1); 
		myList2.add(int2); 
		myList2.add(int3); 
		myList2.add(int4); 
		boolean actual = ut.containList(myList2); 
		boolean expected = true;
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_07_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		myList2.add(int1); 
		myList2.add(int2); 
		myList2.add(new OddNumber(5)); 
		myList2.add(int4); 
		boolean actual = ut.containList(myList2); 
		boolean expected = false; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_04_08_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		myList2.add(int1); 
		myList2.add(int2); 
		myList2.add(new OddNumber(5)); 
		myList2.add(int4); 
		boolean actual = ut.containList(myList2); 
		boolean expected = false; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}

	@Test
	public void test_04_09_()  {
		MyInteger int1 = new MyInteger(1);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(4);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1); 
		myList.add(int2); 
		myList.add(int3); 
		myList.add(int4); 
		Utility<MyInteger> ut = new Utility<MyInteger>(myList); 
		List<MyInteger> myList2 = new ArrayList<MyInteger>(); 
		myList2.add(int1); 
		myList2.add(int2); 
		myList2.add(new OddNumber(5)); 
		myList2.add(int4); 
		boolean actual = ut.containList(myList2); 
		boolean expected = false; 
		assertEquals("containList Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_05_01_()  {
		MyInteger int1 = new MyInteger(200);
		MyInteger int2 = new NaturalNumber(2);
		MyInteger int3 = new OddNumber(3);
		MyInteger int4 = new EvenNumber(40);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1);
		myList.add(int2);
		myList.add(int3);
		myList.add(int4);
		Utility<MyInteger> ut = new Utility<MyInteger>(); 
		ut.removeMultipleOf10(myList);
		boolean actual = myList.size() == 2; 
		boolean expected = true; 
		assertEquals("removeMultipleOf10 Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}
	
	@Test
	public void test_05_02_()  {
		MyInteger int1 = new MyInteger(10);
		List<MyInteger> myList = new ArrayList<MyInteger>(); 
		myList.add(int1);
		myList.add(int1);
		myList.add(int1);
		myList.add(int1);
		Utility<MyInteger> ut = new Utility<MyInteger>(); 
		ut.removeMultipleOf10(myList);
		boolean actual = myList.size() == 0; 
		boolean expected = true; 
		assertEquals("removeMultipleOf10 Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}

	@Test
	public void test_05_03_()  {
		NaturalNumber int1 = new NaturalNumber(20);
		NaturalNumber int2 = new NaturalNumber(1);
		List<NaturalNumber> myList = new ArrayList<NaturalNumber>(); 
		myList.add(int1);
		myList.add(int2);
		myList.add(int1);
		myList.add(int2);
		Utility<MyInteger> ut = new Utility<MyInteger>(); 
		ut.removeMultipleOf10(myList);
		boolean actual = myList.size() == 2; 
		boolean expected = true; 
		assertEquals("removeMultipleOf10 Failed! " + expected + " expected but "+ actual + " is given",expected, actual);
	}

}
