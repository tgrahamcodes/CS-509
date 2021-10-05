package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import starting.model.Coordinate;
import starting.model.Node;

class TestNode {

	@Test
	void testContains() {
		Node n = new Node();
		n.setRow(25);
		n.setCol(0);
		
		assertTrue(n.contains(new Coordinate(25,0)));
		assertFalse(n.contains(new Coordinate(30,1)));
	}
}