import org.junit.*;
import static org.junit.Assert.*;
public class TestArrayIntList{
	@Test
	public void testAddGet1(){
		ArrayIntList list = new ArrayIntList(); 
		list.add(42);list.add(-3);list.add(15); 
		assertEquals(42, list.get(0)); 
		assertEquals(-3, list.get(1)); 
		assertEquals(15,list.get(2));
		}
	
	@Test
	public void testIsEmpty(){
		ArrayIntList list = new ArrayIntList(); 
		assertTrue(list.isEmpty()); 
		list.add(123); 
		assertFalse(list.isEmpty()); 
		list.remove(0);
		assertTrue(list.isEmpty());
		}
	}