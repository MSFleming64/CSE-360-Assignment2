package cse360assign2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddingMachineTest {

	
	@Test
	public void AddingMachine() {
	
		AddingMachine addingMachine = new AddingMachine();
		
		assertEquals(addingMachine.getTotal(),0);
		
		assertEquals(addingMachine.toString(),"0");
		
		addingMachine.add(4);
		
		assertEquals(addingMachine.getTotal(),4);
		
		addingMachine.add(9);
		
		addingMachine.subtract(7);
		
		assertEquals(addingMachine.toString(),"0 + 4 + 9 - 7");

	}
}