package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.*;

public class TestExercise {

	@Test
	public void test01() {
		Exercise benchPress = new Exercise();
		benchPress.setName("   Bench Press        ");
		benchPress.setDescription("  This exercise tagets the chest and shoulders              ");
		assertEquals("Bench Press", benchPress.getName());
		assertEquals("This exercise tagets the chest and shoulders", benchPress.getDescription());
	}

}
