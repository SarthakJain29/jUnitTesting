package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddnumbers {

	@Test
	public void test(){
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addnumbers(100, 200);
		assertEquals(300, result);
	}

}