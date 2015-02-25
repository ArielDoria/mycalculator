package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	//Intializes an array
			public static int[] array = new int[]{1,2,3,4,5,6,7,8};
			public static int[] array1 = new int[]{};
			public static int[] array2 = new int[]{10};
			public static int[] array3 = new int[]{10,11,12,13,14};
			public static int[] array4 = new int[]{8,9,10,11,12};
			//Test the factorial of 4
			@Test
			public void testfactorial4() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.nfactorial(4);
				assertEquals("4!=24",24,actual,0.0);
			}
			
			
			//Test the factorial of 1
			@Test
			public void testnfactorial1() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.nfactorial(1);
				assertEquals("1!=1",1,actual,0.0);
			}
			
			
			//Test the factorial of 0
			@Test
			public void testnfactorial0() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.nfactorial(0);
				assertEquals("0!=1",1,actual,0.0);
			}
			
			//Test the factorial of -1
			@Test
			public void testnfactorialneg1() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.nfactorial(-1);
				assertEquals("-1!=-1",-1,actual,0.0);
			}
			
			//Test the factorial of -3
			@Test
			public void testnfactorialneg3() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.nfactorial(-3);
				assertEquals("-3!=-1",-1,actual,0.0);
			}
			
			//Testing if the the array is empty that will return the value of -1
			@Test
			public void binarySearchTest() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array1,10);
				assertEquals("not found",-1,actual,0.0);
			}
			
			//Test the value if the input has one value
			@Test
			public void binarySearchTest2() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array2,10);
				assertEquals("array2[0]=10",0,actual,0.0);
			}
			
			//Test the value of an array if the value is at the first index
			@Test
			public void binarySearchTest3() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array3,10);
				assertEquals("array3[0]=10",0,actual,0.0);
			}
			
			//test if the value is at the middle index
			@Test
			public void binarySearchTest4() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array4,10);
				assertEquals("array4[10]=10",2,actual,0.0);
			}
			
			//test if the value is at the last index
			@Test
			public void binarySearchTest5() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array4,12);
				assertEquals("array4[4]=12",4,actual,0.0);
			}
			
			//test if the the value is at the second index
			@Test
			public void binarySearchTest6() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array4,9);
				assertEquals("array4[1]=9",1,actual,0.0);
			}
			
			//test if the value is not in the array
			@Test
			public void binarySearchTest7() {
				MyCalculator bc = new MyCalculator();
				float actual = bc.binarySearch(array4,20);
				assertEquals("not found",-1,actual,0.0);
			}

}
