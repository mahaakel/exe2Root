package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	
	// Test for a not quadratic equation  a=0
	@Test
	public void BvaMin() 
	{
		//(0,2,3)
		Roots.calculate_roots(0,2,3);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	
	/// Test for  quadratic equation with two roots 
	@Test 
	public void BvaMinPlus1(){
		
		//(1,5,4)
		Roots.calculate_roots(1,5,4);
				
		String  root_expected = Root_Types.Two_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
		
	}
	
	
	/// Test for  nominal a
		@Test 
		public void BvaNominal(){
			
			//(10,10,2)
			Roots.calculate_roots(10,10,2);
					
			String  root_expected = Root_Types.Two_roots.toString();
			assertEquals(root_expected, Roots.root_types().toString());
			
		}
		
		
	//Test for a max minus 1 with no roots 
		@Test 
		public void BvaMaxMinus1() {
			
			//(99,3,1)
			Roots.calculate_roots(99,3,1);
			
			String  root_expected = Root_Types.No_roots.toString();
			assertEquals(root_expected, Roots.root_types().toString());
			
		}
		
		
		
		
	//Test for a max  with one root Equal roots 
		@Test 
		public void BvaMax() {
			
			//(100,40,4)
			Roots.calculate_roots(100,40,4);
			
			String  root_expected = Root_Types.Equal_roots.toString();
			assertEquals(root_expected, Roots.root_types().toString());
			
		}
		
		//// check all the tests
		
		
		
		
		
		
	
	
	
	
	}
